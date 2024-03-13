package org.example.Iteradores;

// CREACION, LLENADO Y RECORRIDO DE UNA LISTA

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {

        List <Integer> numerosAleatorios = new ArrayList<>();

        for (int i = 0; i < 10; i++ ) {
            //int random = (int) (Math.random() * 10) + 1;
            numerosAleatorios.add((int) (Math.random() * 10) + 1);
        }

        for (int numero : numerosAleatorios) {
            System.out.println(numero);
            if (numero % 3 == 0) {
                break;
            }
        }

    }
}
