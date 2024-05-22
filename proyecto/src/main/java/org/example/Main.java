package org.example;

import Entidades.Herencia.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú\nSeleccione el rol:");
        System.out.println("Cliente             [1]");
        System.out.println("Empleado            [2]");
        System.out.println("Bodeguero           [3]");
        int op = sc.nextInt();

         */

        try (EntityManagerFactory entityManagerFactory =
                     Persistence.createEntityManagerFactory("persistenciaUWU")) {
            /* EntityManager -> Persistence Context*/
            EntityManager em = entityManagerFactory.createEntityManager(); // Representa el conexto de persistencia, se utiliza para manejar las transacciones

            em.getTransaction().begin();

            Cliente c = new Cliente("1150057501","Nahomi","Cabrera","na@utpl.ec", "+593 968467693");
            em.persist(c);

            System.out.println(c);

            em.getTransaction().commit();
        }
    }

}