package org.example.Iteradores;

import java.util.ArrayList;
import java.util.List;

public class Arrays_2 {
    public static void main(String[] args) {

        List <String> colorOriginal = new ArrayList<>();
        colorOriginal.add("Rojo");
        colorOriginal.add("Azul");


        List <String> colorDestino = new ArrayList<>();
        colorDestino.add("Amarillo");
        colorDestino.add("Celeste");
        colorDestino.add("Azul");
        colorDestino.add("Rojo");


        /*

        // METODOS

        // containsAll
        boolean contieneColorOriginal = colorOriginal.containsAll(colorDestino);
        System.out.println("contiene color original: " + contieneColorOriginal);

        boolean contieneColorDestino = colorDestino.containsAll(colorOriginal);
        System.out.println("contiene color original: " + contieneColorDestino);


        // addAll
        colorOriginal.addAll(colorDestino);
        for (String color: colorOriginal) {
            System.out.println("El color es: " + color);
        }

        // removeAll
        colorDestino.removeAll(colorOriginal);
        for (String color: colorDestino) {
            System.out.println("El color es: " + color);
        }

        // retainAll
        colorDestino.retainAll(colorOriginal);
        for (String color: colorDestino) {
            System.out.println("El color es: " + color);
        }


        // clear
        colorDestino.clear();
        for (String color: colorDestino) {
            System.out.println("El color es: " + color);
        }

        */

        // ACCESO POSICIONAL

        // get
        System.out.println("Mi color favorito es: " + colorOriginal.get(1));

        // set
        colorDestino.set(1, "Naranja");
        for (String color : colorDestino) {
            System.out.println("El color es: " + color);
        }

        // remove
        colorDestino.remove(0);
        System.out.println("El color en la posicion 0 es : " + colorDestino.get(0));

        // indexof
        String colorFavorito = "Rosa";
        int existeColorFavorito = colorDestino.indexOf(colorFavorito);
        if (existeColorFavorito == -1) {
            System.out.println("El color favorito no existe");
        } else {
            System.out.println("El color favorito existe: " + colorDestino.get(existeColorFavorito));
        }


        // lastIndexof

    }
}
