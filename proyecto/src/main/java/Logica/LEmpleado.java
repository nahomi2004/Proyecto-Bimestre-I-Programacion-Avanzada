package Logica;

import Entidades.NoHerencia.Entrega;

public class LEmpleado {
    private Entrega entrega;

    public LEmpleado() {
    }

    public LEmpleado(Entrega entrega) {
        this.entrega = entrega;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
