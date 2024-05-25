package org.example;

import Entidades.Herencia.Cliente;
import Entidades.NoHerencia.Direccion;
import Logica.LCliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory entityManagerFactory =
                     Persistence.createEntityManagerFactory("persistenciaUWU")) {
            /* EntityManager -> Persistence Context*/
            EntityManager em = entityManagerFactory.createEntityManager(); // Representa el conexto de persistencia, se utiliza para manejar las transacciones
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Seleccione el rol:");
                System.out.println("1. Cliente");
                System.out.println("2. Bodeguero");
                System.out.println("3. Repartidor");
                System.out.println("4. Salir");
                int rol = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea

                switch (rol) {
                    case 1:
                        gestionarCliente(em, sc);
                        break;
                    case 2:
                        gestionarBodeguero(em, sc);
                        break;
                    case 3:
                        gestionarRepartidor(em, sc);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida");
                }
        /*
            em.getTransaction().begin();

            Cliente c = new Cliente("1150057501","Nahomi","Cabrera","na@utpl.ec", "+593 968467693");
            em.persist(c);

            System.out.println(c);

            em.getTransaction().commit();*/

        }
    }

}
    private static void gestionarCliente(EntityManager em, Scanner scanner) {
        System.out.println("1. Crear Cliente");
        System.out.println("2. Crear y cambiar direcciones");
        System.out.println("3. Revisar los estados de sus paquetes");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                registrarNuevoCliente(em, scanner);
                break;
            case 2:
                agregarDireccionCliente(em, scanner);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private static void gestionarBodeguero(EntityManager em, Scanner scanner) {
        System.out.println("1. Registrar un nuevo cliente");
        System.out.println("2. Registrar un nuevo cliente y sus direcciones");
        System.out.println("3. Registrar un nuevo paquete");
        System.out.println("4. Despachar un paquete");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                registrarNuevoCliente(em, scanner);
                break;
            case 2:
                agregarDireccionCliente(em, scanner);
                break;
            case 3:
                registrarNuevoPaquete(em, scanner);
                break;
            case 4:
                despacharPaquete(em, scanner);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private static void gestionarRepartidor(EntityManager em, Scanner scanner) {
        System.out.println("1. Registrar la entrega de un paquete");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        if (opcion == 1) {
            registrarEntregaPaquete(em, scanner);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private static void registrarNuevoCliente(EntityManager em, Scanner scanner) {
        LCliente lcliente = new LCliente();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        while (!lcliente.comprobarCedula(cedula)) {
            System.out.println("Cédula inválida. Por favor, ingrese una cédula válida de 10 dígitos.");
            System.out.print("Cédula: ");
            cedula = scanner.nextLine();
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
        while (!lcliente.comprobarCorreo(email)) {
            System.out.println("Correo electronico invalido. Por favor, ingrese un correo electrónico valido.");
            System.out.print("Email: ");
            email = scanner.nextLine();
        }

        System.out.print("Celular: ");
        String celular = scanner.nextLine();

        Cliente cliente = new Cliente(cedula, nombre, apellido, email, celular);
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        System.out.println("Cliente registrado con éxito: " + cliente);
    }

    private static void agregarDireccionCliente(EntityManager em, Scanner scanner) {
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = scanner.nextLine();
        Cliente cliente = em.find(Cliente.class, cedula);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Código de la dirección: ");
        String codigo = scanner.nextLine();
        System.out.print("Calle 1: ");
        String calle1 = scanner.nextLine();
        System.out.print("Calle 2: ");
        String calle2 = scanner.nextLine();
        System.out.print("Referencia: ");
        String referencia = scanner.nextLine();
        System.out.print("¿Es la dirección actual? (1 para sí, 0 para no): ");
        int actual = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Direccion direccion = new Direccion(codigo, calle1, calle2, referencia, actual);

        em.getTransaction().begin();
        em.persist(direccion);
        em.getTransaction().commit();

        System.out.println("Dirección registrada con éxito: " + direccion);
    }

    private static void registrarNuevoPaquete(EntityManager em, Scanner scanner) {
        // Implementar la lógica para registrar un nuevo paquete
    }

    private static void despacharPaquete(EntityManager em, Scanner scanner) {
        // Implementar la lógica para despachar un paquete
    }

    private static void registrarEntregaPaquete(EntityManager em, Scanner scanner) {
        // Implementar la lógica para registrar la entrega de un paquete
    }
}
