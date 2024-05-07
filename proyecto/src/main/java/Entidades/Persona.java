package Entidades;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String mail;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String mail) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Datos Personales\n" +
                "\tCedula: " + cedula +
                "\n\tNombre: " + nombre +
                "\n\tApellido: " + apellido +
                "\n\tMail: " + mail;
    }
}
