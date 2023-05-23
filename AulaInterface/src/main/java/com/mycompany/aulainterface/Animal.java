package com.mycompany.aulainterface;

public class Animal implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Animal acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Animal freando...");
    }
}
