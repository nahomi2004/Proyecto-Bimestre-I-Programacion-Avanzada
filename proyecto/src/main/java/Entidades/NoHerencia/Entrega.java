package Entidades.NoHerencia;

import Entidades.Herencia.Cliente;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Entrega {
    @Id
    private String codigo;

    @Basic
    private LocalDate fecha;
    private String obs;
    @OneToOne
    @JoinColumn(name = "paquete_idPaquete")
    private Paquete paquete;

    @OneToOne
    @JoinColumn(name = "cliente_cedula")
    private Cliente cliente;

    public Entrega() {
    }

    public Entrega(String codigo, LocalDate fecha, String obs) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.obs = obs;
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

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Entrega" +
                "\n\tCodigo: " + codigo +
                "\n\tFecha: " + fecha +
                "\n\tObservación: " + obs;
    }
}
