package Entidades.Herencia;

import Entidades.NoHerencia.Direccion;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;


@Entity
public class Cliente extends Persona {
    private String celular;
    @OneToMany(mappedBy = "cliente")
    private ArrayList<Direccion> direcciones;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String mail, String celular) {
        super(cedula, nombre, apellido, mail);
        this.celular = celular;
        direcciones = new ArrayList<>();
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
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
        return super.toString() + "\nDatos del Cliente\n"
                + "\tCelular: " + celular;
    }
}
