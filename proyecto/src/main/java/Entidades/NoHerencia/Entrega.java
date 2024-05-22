package Entidades.NoHerencia;

import Entidades.Herencia.Cliente;
import Entidades.Herencia.Repartidor;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Entrega {
    @Id
    private String codigo;

    @Basic
    private LocalDate fecha;
    private String obs;
    @OneToMany(mappedBy = "entrega")
    private List<Paquete> paquetes;

    @ManyToOne
    @JoinColumn(name = "cliente_cedula")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "repartidor_cedula")
    private Repartidor repartidor;
    public Entrega() {
    }

    public Entrega(String codigo, LocalDate fecha, String obs) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.obs = obs;
        this.paquetes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquete) {
        this.paquetes = paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    @Override
    public String toString() {
        return "Entrega" +
                "\n\tCodigo: " + codigo +
                "\n\tFecha: " + fecha +
                "\n\tObservación: " + obs;
    }
}
