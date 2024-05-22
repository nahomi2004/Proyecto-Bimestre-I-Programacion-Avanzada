package Entidades.Herencia;

import Entidades.NoHerencia.Direccion;
import Entidades.NoHerencia.Entrega;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;

@Entity
public class Repartidor extends Empleado {
    private int zona;

    @OneToMany(mappedBy = "empleado")
    private ArrayList<Entrega> entregas;
    public Repartidor() {
    }

    public Repartidor(String cedula, String nombre, String apellido, String mail, String ciudad, int zona) {
        super(cedula, nombre, apellido, mail, ciudad);
        this.zona = zona;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Entrega> entregas) {
        this.entregas = entregas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tTipo: Repartidor" +
                "\n\tZona: " + zona;
    }
}
