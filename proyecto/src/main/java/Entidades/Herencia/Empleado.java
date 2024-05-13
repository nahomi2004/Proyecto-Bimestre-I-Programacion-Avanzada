package Entidades.Herencia;

import Entidades.NoHerencia.Entrega;

public class Empleado extends Persona {
    private String ciudad;
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
