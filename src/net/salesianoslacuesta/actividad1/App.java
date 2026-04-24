package net.salesianoslacuesta.actividad1;

import java.util.Scanner;
import net.salesianoslacuesta.actividad1.calculoGeometricoBidimensional.CalculoGeometricoBidimensional;
import net.salesianoslacuesta.actividad1.circulo.Circulo;
import net.salesianoslacuesta.actividad1.rectangulo.Rectangulo;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RECTÁNGULO ===");

        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println();
        System.out.println("Rectángulo creado con base " + rectangulo.getBase()
                + " y altura " + rectangulo.getAltura());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println();
        System.out.println("=== CÍRCULO ===");

        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println();
        System.out.println("Círculo creado con radio " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        sc.close();
    }
}
