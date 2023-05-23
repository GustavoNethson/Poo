package com.mycompany.aulainterface;

public class Moto implements Veiculo {

    public int corteDeGiro;

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
}
