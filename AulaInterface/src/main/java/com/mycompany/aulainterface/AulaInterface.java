package com.mycompany.aulainterface;

public class AulaInterface {

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo ani = new Animal();

        carro.acelerar();
        moto.frear();
        ani.frear();
    }
}

