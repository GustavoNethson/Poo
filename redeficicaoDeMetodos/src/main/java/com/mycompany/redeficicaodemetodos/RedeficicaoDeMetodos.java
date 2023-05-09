package com.mycompany.redeficicaodemetodos;

public class RedeficicaoDeMetodos {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerBarulho();
        
        animal = new Gato();
        animal.fazerBarulho();
        
    }
}
