package org.example;

public class Circulo implements Figura{

    private double PI = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public double calcularArea(){
        return PI * this.radio * this.radio;
    }

}
