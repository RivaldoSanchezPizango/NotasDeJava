package org.example.control_de_flujos;

// Debemos desarrolar una calculadora que realize las cuatro operaciones basicas (suma - resta - multiplicacion - division)
// a partir de 2 numeros y operacion ingresados por el usuario

import java.util.Scanner;

public class EjerciciosBasicos_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la operacion que quiera praticar: ");
        String operacion = sc.nextLine();

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        int numero2 = sc.nextInt();


        switch (operacion) {
            case "suma":
                numero = numero + numero2;
                break;
            case "resta":
                numero = numero - numero2;
                break;
            case "multiplicacion":
                numero = numero * numero2;
                break;
            case "division":
                numero = numero / numero2;
                break;
            default:
                numero = 0;
                break;
        }

        System.out.println("El resultado de tu operacion es: " + numero );

        sc.close();

    }
}
