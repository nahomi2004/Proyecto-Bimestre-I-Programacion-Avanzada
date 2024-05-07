package Entidades.NoHerencia;

import java.time.LocalDate;

public class Entrega {
    private String codigo;
    private LocalDate fecha;
    private String obs;

    public Entrega() {
    }

    public Entrega(String codigo, LocalDate fecha, String obs) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.obs = obs;
    }


}
