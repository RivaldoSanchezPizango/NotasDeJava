package org.example.control_de_flujos;

public class Condicionales {
    public static void main(String[] args) {

        int edad = 14;
        if (edad >= 18) {
            System.out.println("Puede entrar");
        } else {
            System.out.println("No puede entrar");
        }


        int numeroGanador = 23;

        if (numeroGanador == 23) {
            System.out.println("Usted gano");
        } else if (numeroGanador != 23) {
            System.out.println("Intente una vez mas..");
        }

        System.out.println("--------------Sistema de notas con condicionales--------------------");
        // Sistema de notas con condicional if

        // 1 - 4 reprobado 5 - 6 aprobado (bien) 7 - 8 aprobado (muy bien) 9 - 10 excelente

        int nota = 10;

        if (nota <= 4) {
            System.out.println("reprobado");
        } else if (nota == 5 || nota == 6 ) {
            System.out.println("aprobado Bien");
        } else if (nota == 7 || nota == 8 ) {
            System.out.println("aprobado Muy bien");
        }else if (nota == 9 || nota == 10 ) {
            System.out.println("aprobado Excelente");
        } else {
            System.out.println("Nota invalida");
        }

    }
}
