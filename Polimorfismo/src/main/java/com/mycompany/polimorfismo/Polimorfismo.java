package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args){
        Circulo circulo = new Circulo();
        circulo.desenhar();
        Forma quadrado = new Quadrado();
        quadrado.desenhar();
    
    }
}
