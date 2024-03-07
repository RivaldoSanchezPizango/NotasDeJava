package org.example.variables;

public class Prestamo {
    public static void main(String[] args) {

        int capitalSolicitado = 1000;
        double intereses = 2;
        int cuotas = 12;

        int interesAPagar = capitalSolicitado * (int) intereses * cuotas;

        int montoTotal = interesAPagar + capitalSolicitado;

        System.out.println("El interes a pagar es de: " + montoTotal);

    }
}
