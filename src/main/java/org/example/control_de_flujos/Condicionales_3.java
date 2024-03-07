package org.example.control_de_flujos;

public class Condicionales_3 {
    public static void main(String[] args) {

        // FUNCIONALIDADES DE DATOS ALEATORIOS
        double random = 0.0;
        random = Math.random();
        System.out.println("numero random: " + random);
        random = Math.random();
        System.out.println("numero random: " + random);
        random = Math.random();
        System.out.println("numero random: " + random);



        int minimo = 1, maximo = 64, rango = maximo - minimo +1;

        int numeroRandom = 0;

        numeroRandom = (int) (Math.random() * rango) + minimo;
        System.out.println("RANGO: " + rango);
        System.out.println("random: " + numeroRandom);

        numeroRandom = (int) (Math.random() * rango) + minimo;
        System.out.println("random: " + numeroRandom);

        numeroRandom = (int) (Math.random() * rango) + minimo;
        System.out.println("random: " + numeroRandom);

        numeroRandom = (int) (Math.random() * rango) + minimo;
        System.out.println("random: " + numeroRandom);


        int edad = (int) (Math.random() * rango) + minimo;
        System.out.println(edad);
        boolean puedeEntrar = edad > 18 && edad < 60;
        String mensaje = puedeEntrar ? "Puede entrar" : "No puede entrar";
        System.out.println(mensaje);

    }
}
