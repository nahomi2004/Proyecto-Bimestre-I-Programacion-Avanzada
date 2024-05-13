package Logica;

import Entidades.Herencia.Cliente;
import Entidades.NoHerencia.Direccion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LCliente {
    private Cliente cliente;

    public LCliente() {
    }

    public LCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean comprobarCedula(String cedula) {
        return cedula.length() == 10 && cedula.substring(0, 9).matches("[0-9]*");
    }

    public Boolean comprobarCorreo() {
        String regex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cliente.getMail());
        return matcher.matches();
    }

    public Boolean comprobarDirecciones() {
        for (int i = 0; i < cliente.getDirecciones().size(); i++) {
            for (int j = i + 1; j < cliente.getDirecciones().size(); i++) {
                return (cliente.getDirecciones().get(i).equals(cliente.getDirecciones().get(j)));
            }
        }
        return false;
    }

    public Direccion direccionActual() {
        return cliente.getDirecciones().get(cliente.getDirecciones().size() - 1);
    }
}
