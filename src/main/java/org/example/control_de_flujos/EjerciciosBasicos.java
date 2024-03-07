package org.example.control_de_flujos;


// Crear un programa que sume dos numeros ingresado por el usuario y muestre el resultado por pantalla
public class EjerciciosBasicos {
    public static void main(String[] args) {

        int numeroUno = (int) (Math.random()  * 10);
        int numeroDos = (int) (Math.random() * 10);

        System.out.println(numeroUno);
        System.out.println(numeroDos);

        System.out.println("La suma de los 2 numeros es: " + (numeroUno + numeroDos));
    }
}
