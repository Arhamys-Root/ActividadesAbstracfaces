package net.salesianoslacuesta.actividad2.vehiculo;

public abstract class Vehiculo {

    protected String color;
    protected int numeroPuertas;
    protected int numeroRuedas;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String color, int numeroPuertas, int numeroRuedas,
                    String modelo, String matricula) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract void arrancar();

    public abstract void pararMotor();

    public abstract void mover();
}