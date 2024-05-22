package Entidades.NoHerencia;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Arrays;

@Entity
public class Paquete {
    @Id
    private int idPaquete;

    @Basic
    private String codigo;
    private String descrip;
    private int peso;
    private int alto;

    @OneToMany(mappedBy = "paquete")
    private Estado[] estados = new Estado[4];

    @ManyToOne
    @JoinColumn(name = "entrega_codigo")
    private Entrega entrega;

    public Paquete() {
    }

    public Paquete(int idPaquete, String codigo, String descrip, int peso, int alto) {
        this.idPaquete = idPaquete;
        this.codigo = codigo;
        this.descrip = descrip;
        this.peso = peso;
        this.alto = alto;
        estados[0] = new Estado(1, "Creado", LocalDate.now(), "Creado con éxito");
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Estado[] getEstados() {
        return estados;
    }

    public void setEstados(Estado[] estados) {
        this.estados = estados;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        String cadena = String.format("Paquete" +
                "\n\tID: " + idPaquete +
                "\n\tCodigo: " + codigo +
                "\n\tDescripción: " + descrip +
                "\n\tPeso: " + peso +
                "\n\tAlto: " + alto +
                "\n\tEstados: " + Arrays.toString(estados));

        for(int i = 1; i <= 4; i++) {
            cadena = cadena + estados[i].toString() + "\n";
        }

        return cadena;
    }
}
