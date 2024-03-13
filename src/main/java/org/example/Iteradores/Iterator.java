package org.example.Iteradores;

import java.util.ArrayList;
import java.util.List;

public class Iterator<S> {
    public static void main(String[] args) {
        List <String> jugadoresDeFutbol = new ArrayList<>();
        jugadoresDeFutbol.add("L. Messi");
        jugadoresDeFutbol.add("C. Ronaldo");
        jugadoresDeFutbol.add("E. Haaland");
        jugadoresDeFutbol.add("K. Mbappe");
        jugadoresDeFutbol.add("O. Giroud");
        jugadoresDeFutbol.add("V. Junior");
        jugadoresDeFutbol.add("Neymar");

        // ITERATOR
        java.util.Iterator<String> iterator = jugadoresDeFutbol.iterator();
        while (iterator.hasNext()) {
            String jugador = iterator.next();
            System.out.println( "El nombres del jugador es: " + jugador);
        }

    }
}
