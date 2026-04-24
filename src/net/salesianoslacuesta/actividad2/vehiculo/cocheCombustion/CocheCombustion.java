package net.salesianoslacuesta.actividad2.vehiculo.cocheCombustion;

import net.salesianoslacuesta.actividad2.vehiculo.Vehiculo;

public class CocheCombustion extends Vehiculo {

    private boolean motorCombustionEncendido;
    private int litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas,
            String modelo, String matricula,
            boolean motorCombustionEncendido,
            int litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.motorCombustionEncendido = motorCombustionEncendido;
        this.litrosCombustible = litrosCombustible;
    }

    public boolean isMotorCombustionEncendido() {
        return motorCombustionEncendido;
    }

    public int getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setMotorCombustionEncendido(boolean motorCombustionEncendido) {
        this.motorCombustionEncendido = motorCombustionEncendido;
    }

    public void setLitrosCombustible(int litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible > 0) {
            litrosCombustible--;
            motorCombustionEncendido = true;
            System.out.println("El coche ha arrancado. Se ha consumido 1 litro de combustible.");
        } else {
            motorCombustionEncendido = false;
            System.out.println("No se puede arrancar. No hay combustible.");
        }
    }

    @Override
    public void pararMotor() {
        motorCombustionEncendido = false;
        System.out.println("El motor se ha parado.");
    }

    @Override
    public void mover() {
        if (!motorCombustionEncendido) {
            System.out.println("El coche no puede moverse porque el motor no está arrancado.");
            return;
        }

        if (litrosCombustible <= 0) {
            System.out.println("El coche no puede moverse porque no tiene combustible.");
            pararMotor();
            return;
        }

        litrosCombustible--;
        System.out.println("El coche se ha movido. Se ha consumido 1 litro de combustible.");

        if (litrosCombustible == 0) {
            System.out.println("El coche se ha quedado sin combustible.");
            pararMotor();
        }
    }

    @Override
    public String toString() {
        return "CocheCombustion{" +
                "color='" + color + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", numeroRuedas=" + numeroRuedas +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", motorCombustionEncendido=" + motorCombustionEncendido +
                ", litrosCombustible=" + litrosCombustible +
                '}';
    }
}
