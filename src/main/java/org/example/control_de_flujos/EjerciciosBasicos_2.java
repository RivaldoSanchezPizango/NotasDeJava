package org.example.control_de_flujos;

// Debemos desarrollar un programa que calcule el area de un triangulo a partir de la base y la altura ingresadas por el usuario
// Area = (base \* altura) / 2


public class EjerciciosBasicos_2 {
    public static void main(String[] args) {

        double base = (Math.random() * 20) + 1;
        double altura = (Math.random()  * 20) + 1;

        double area = (base * altura) / 2;

        System.out.println("El area es: " + area);

    }
}
