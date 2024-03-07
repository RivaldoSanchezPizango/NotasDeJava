package org.example.control_de_flujos;

// Creamos un programa que convierta una temperatura en grados celsius o grados fahrenheit
// Fahrenheit = (9/5) \* c + 32


public class EjerciciosBasicos_3 {
    public static void main(String[] args) {
        // Math.round() nos devuelve un numero redondeado
        //double celsius = Math.round((Math.random() * 30) + 1);

        double celsius = (Math.random() * 30) + 1;

        double fahrenheit = (9 / 5) * celsius + 32;

        System.out.println(celsius);
        System.out.println(fahrenheit);

    }
}
