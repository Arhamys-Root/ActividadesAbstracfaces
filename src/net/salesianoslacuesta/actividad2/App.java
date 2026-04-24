package net.salesianoslacuesta.actividad2;

import net.salesianoslacuesta.actividad2.vehiculo.cocheCombustion.CocheCombustion;

public class App {

    public static void main(String[] args) {

        CocheCombustion coche = new CocheCombustion(
                "Rojo",
                5,
                4,
                "Seat León",
                "1234ABC",
                false,
                20
        );

        System.out.println("=== COCHE DE COMBUSTIÓN ===");
        System.out.println(coche);

        System.out.println();
        System.out.println("Intentamos mover el coche antes de arrancarlo:");
        coche.mover();

        System.out.println();
        System.out.println("Arrancamos el motor:");
        coche.arrancar();

        System.out.println();
        System.out.println("Movemos el coche varias veces:");
        coche.mover();
        coche.mover();
        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println();
        System.out.println("Combustible restante: " + coche.getLitrosCombustible() + " litros.");

        System.out.println();
        System.out.println("Modificamos el combustible a 2 litros.");
        coche.setLitrosCombustible(2);

        System.out.println();
        System.out.println("Movemos el coche tres veces más:");
        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println();
        System.out.println("Estado final del coche:");
        System.out.println(coche);
    }
}
