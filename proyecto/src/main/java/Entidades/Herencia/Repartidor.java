package Entidades.Herencia;

import Entidades.NoHerencia.Direccion;
import Entidades.NoHerencia.Entrega;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Repartidor extends Empleado {
    private int zona;

    @OneToMany(mappedBy = "repartidor")
    private List<Entrega> entregas;
    public Repartidor() {
    }

    public Repartidor(String cedula, String nombre, String apellido, String mail, String ciudad, int zona) {
        super(cedula, nombre, apellido, mail, ciudad);
        this.zona = zona;
        this.entregas = new ArrayList<>();
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tTipo: Repartidor" +
                "\n\tZona: " + zona;
    }
}
