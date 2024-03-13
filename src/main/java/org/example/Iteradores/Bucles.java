package org.example.Iteradores;

public class Bucles {
    public static void main(String[] args) {

        int limite = 5;
        int bandera = 0;

        // WHILE
        while (bandera < limite ) {
            System.out.println("Hola");
            bandera ++;
        }

        // DO WHILE
        do{
            System.out.println("Hola");
            bandera ++;
        } while (bandera < limite);


        // FOR
        int[] numeros = new int[5];
/*
        numeros[0] = 234;
        numeros[1] = 325;
        numeros[2] = 187;
        numeros[3] = 234;
        numeros[4] = 343;
*/
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }

        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros: " + numeros[i]);
        }
        */

        // FOR MEJORADO
        for (int numero : numeros){
            System.out.println("numero: " + numero);
        }

    }
}
