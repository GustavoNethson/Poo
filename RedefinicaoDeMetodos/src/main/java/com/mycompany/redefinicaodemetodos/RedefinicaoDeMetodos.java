package com.mycompany.redefinicaodemetodos;


public class RedefinicaoDeMetodos {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
            animal.emitirSom(); 
            
            animal = new Gato();
            animal.emitirSom();
            
            animal = new Elefante();
            animal.emitirSom();
    }
}
