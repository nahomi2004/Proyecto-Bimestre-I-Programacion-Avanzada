package Entidades.Herencia;

public class Empleado extends Persona {
    private String ciudad;

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

    @Override
    public String toString() {
        return super.toString() + "\nDatos del Empleado\n" +
                "\tCiudad: " + ciudad;
    }
}
