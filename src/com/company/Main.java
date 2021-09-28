package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String nombre, apellidos, correo, fechaNacimiento;
        int numeroMenu, dni;
        char letraDni;


        System.out.println("Bienvenido a tu app de UPMBank. Selecciona el número del trámite que deseas realizar.");
        System.out.println("1. Darse de alta");
        System.out.println("2. Crear una cuenta bancaria");
        System.out.println("3. Realizar un depósito");
        System.out.println("4. Realizar una extracción");
        System.out.println("5. Realizar una transferencia");
        System.out.println("6. Solicitar un préstamo");
        System.out.println("7. Mostrar datos del cliente");
        Scanner teclado = new Scanner(System.in);
        numeroMenu = teclado.nextInt();

        if (numeroMenu == 1)
        {
            System.out.println("Introduce tu nombre: ");
            nombre = teclado.next();
            System.out.println("Introduce tus apellidos: ");
            apellidos = teclado.next();
            System.out.println("Hola "+nombre+" "+apellidos);
            System.out.println("Introduce tu correo:");
            correo = teclado.next();
            System.out.println("Introduce tu fecha de nacimiento: formato (dd/mm/aa)");
            fechaNacimiento = teclado.next();
            System.out.println("Introduce tu DNI");
            dni = teclado.nextInt();
            System.out.println("Introduce la letra de tu DNI:");
            letraDni = teclado.next().charAt(0);
            System.out.println("Perfecto, ya estás registrado en UPMBank.");
        }

        if (numeroMenu == 2)
        {
            System.out.println("Qué tipo de cuenta estás buscando?");
            System.out.println("1. Corriente");
            System.out.println("2. Ahorro");
            System.out.println("3. Remunerada");
        }


    }
}
