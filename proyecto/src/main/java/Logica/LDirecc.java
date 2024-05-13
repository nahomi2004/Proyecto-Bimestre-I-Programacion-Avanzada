package Logica;

import Entidades.NoHerencia.Direccion;

public class LDirecc {
    private Direccion direccion;

    public LDirecc() {
    }

    public LDirecc(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Boolean comprobarCalles (){
        String principal = direccion.getCalle1().replaceAll("\\D", "").toLowerCase();
        String sec1 = direccion.getCalle2().replaceAll("\\D", "").toLowerCase();

        return principal.equals(sec1);
    }
}
