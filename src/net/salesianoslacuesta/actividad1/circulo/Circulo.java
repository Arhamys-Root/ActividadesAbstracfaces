package net.salesianoslacuesta.actividad1.circulo;
import net.salesianoslacuesta.actividad1.calculoGeometricoBidimensional.CalculoGeometricoBidimensional;

public class Circulo implements CalculoGeometricoBidimensional {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
