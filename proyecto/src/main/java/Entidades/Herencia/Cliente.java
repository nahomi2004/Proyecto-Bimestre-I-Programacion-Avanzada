package Entidades.Herencia;

import Entidades.NoHerencia.Direccion;
import Entidades.NoHerencia.Entrega;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Cliente extends Persona {
    private String celular;
    @OneToMany(mappedBy = "cliente")
    private List<Direccion> direcciones;

    @OneToMany(mappedBy = "cliente")
    private List<Entrega> entregas;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String mail, String celular) {
        super(cedula, nombre, apellido, mail);
        this.celular = celular;
        this.direcciones = new ArrayList<>();
        this.entregas = new ArrayList<>();
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    /*Método HacerActual()  ---->   actualiza la dirección actual*/
    @Override
    public String toString() {
        return super.toString() + "\nDatos del Cliente\n"
                + "\tCelular: " + celular;
    }
}
