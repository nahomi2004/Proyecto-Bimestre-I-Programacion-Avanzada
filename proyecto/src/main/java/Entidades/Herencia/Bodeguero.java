package Entidades.Herencia;

import jakarta.persistence.Entity;

@Entity
public class Bodeguero extends  Empleado {
    private String local;

    public Bodeguero() {
    }

    public Bodeguero(String cedula, String nombre, String apellido, String mail, String ciudad, String local) {
        super(cedula, nombre, apellido, mail, ciudad);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tTipo: Bodeguero" +
                "\n\tLocal: " + local;
    }
}
