package org.example.control_de_flujos;

// Desarrollaremos un programa que verifique si un numero ingresado por el usuario
// es par o impar
// esPar = numero % 2 == 0
// esImpar = numero % 2 != 0


import java.util.Scanner;

public class EjerciciosBasicos_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un numero");

        int numero = entrada.nextInt();

       /* boolean isPar = numero % 2 == 0;

        if (isPar) {
            System.out.println("El numero ingresado es par.");
        } else {
            System.out.println("El numero ingresado es impar");
        } */

        String mensaje = numero % 2 == 0 ? "Es par" : "Es impar";

        System.out.println(mensaje);

        entrada.close();
    }
}
