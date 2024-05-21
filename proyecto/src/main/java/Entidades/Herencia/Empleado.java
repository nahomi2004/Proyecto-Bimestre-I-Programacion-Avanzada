package Entidades.Herencia;

import Entidades.NoHerencia.Entrega;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Empleado extends Persona {
    private String ciudad;
    @OneToOne
    @JoinColumn(name = "entrega_codigo")
    private Entrega entrega;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String apellido, String mail, String ciudad) {
        super(cedula, nombre, apellido, mail);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDatos del Empleado\n" +
                "\tCiudad: " + ciudad;
    }
}
