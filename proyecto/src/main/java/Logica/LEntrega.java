package Logica;

import Entidades.NoHerencia.Entrega;

public class LEntrega {
    Entrega entrega;

    public LEntrega() {
    }

    public LEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public boolean comprobarEstado1() {
        if(entrega.getPaquetes().getEstados()[0].getFecha() == null){
            return true;
        }
        return false;
    }

    public boolean comprobarEstado2() {
        if(entrega.getPaquetes().getEstados()[1].getFecha() == null){
            return true;
        }
        return false;
    }

    public boolean comprobarEstado3() {
        if(entrega.getPaquetes().getEstados()[2].getFecha() == null){
            return true;
        }
        return false;
    }
    public boolean comprobarEstado4() {
        if(entrega.getPaquetes().getEstados()[3].getFecha() == null){
            return true;
        }
        return false;
    }
}
