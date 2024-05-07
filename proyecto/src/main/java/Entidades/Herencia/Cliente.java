package Entidades.Herencia;

public class Cliente extends Persona{
    private String celular;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String mail, String celular) {
        super(cedula, nombre, apellido, mail);
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    /*Método HacerActual()  ---->   actualiza la dirección actual*/

    @Override
    public String toString() {
        return super.toString() + "\nDatos del Cliente\n" +
                "\tCelular: " + celular;
    }
}
