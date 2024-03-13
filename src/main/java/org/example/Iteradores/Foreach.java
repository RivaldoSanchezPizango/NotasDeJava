package org.example.Iteradores;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List <String> equipos = new ArrayList<>();

        equipos.add("Boca");
        equipos.add("River");
        equipos.add("Racing");
        equipos.add("Independiente");

        equipos.forEach(equipo -> {
            System.out.println("El equipo es: " + equipo);
        });
    }
}
