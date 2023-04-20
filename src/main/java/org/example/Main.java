package org.example;

import org.example.herenciamultiple.AlumnoCrack;

public class Main {
    public static void main(String[] args) {
        Cuadrado cua = new Cuadrado();
        cua.setLado(5);
        System.out.println("El lado es " + cua.calcularArea());

        Circulo cir = new Circulo();
        cir.setRadio(3.5);
        System.out.println("El radio es " + cir.calcularArea());

        AlumnoCrack ada = new AlumnoCrack();
        ada.setNombre("Marcos");
        ada.setArte("Arte Urbano");
        ada.setDeporte("Skate");
        System.out.println(ada);
        ada.ensayar("Graffiti");
        ada.entrenar();
        ada.presentarCompetencia("Iztapalapa");

    }
}