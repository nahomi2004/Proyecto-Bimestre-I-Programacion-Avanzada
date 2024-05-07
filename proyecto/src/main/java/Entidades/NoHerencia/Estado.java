package Entidades.NoHerencia;

import java.time.LocalDate;

public class Estado {
    private int tipo;
    private String estado;
    private LocalDate fecha;
    private String observacion;

    public Estado() {
    }

    public Estado(int tipo, String estado, LocalDate fecha, String observacion) {
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Estado" +
                "\n\tTipo: " + tipo +
                "\n\tEstado " + estado +
                "\n\tFecha: " + fecha +
                "\n\tObservacion: " + observacion;
    }
}
