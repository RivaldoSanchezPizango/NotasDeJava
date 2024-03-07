package org.example.control_de_flujos;

public class DesafiosGenericos {
    public static void main(String[] args) {
        String mes = "noviembre";
        int numeroMes;

        switch (mes) {
            case "enero":
                numeroMes = 1;
                break;
            case "febrero":
                numeroMes = 2;
                break;
            case "marzo":
                numeroMes = 3;
                break;
            case "abril":
                numeroMes = 4;
                break;
            case "mayo":
                numeroMes = 5;
                break;
            case "junio":
                numeroMes = 6;
                break;
            case "julio":
                numeroMes = 7;
                break;
            case "agosto":
                numeroMes = 8;
                break;
            case "septiembre":
                numeroMes = 9;
                break;
            case "octubre":
                numeroMes = 10;
                break;
            case "noviembre":
                numeroMes = 11;
                break;
            case "diciembre":
                numeroMes = 12;
                break;
            default:
                numeroMes = 0;
                break;
        };

        System.out.println("EL numero del mes ingresado es: " + numeroMes);
    }
}
