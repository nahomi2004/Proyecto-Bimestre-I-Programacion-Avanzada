package Entidades.Herencia;

public class Repartidor extends Empleado {
    private int zona;

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

    @Override
    public String toString() {
        return super.toString() + "\n\tTipo: Repartidor" +
                "\n\tZona: " + zona;
    }
}
