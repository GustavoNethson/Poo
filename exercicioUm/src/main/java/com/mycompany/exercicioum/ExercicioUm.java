package com.mycompany.exercicioum;

public class ExercicioUm {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
            animal.emitirSom(); 
            animal.mover();
            
            animal = new Gato();
            animal.emitirSom();
            animal.mover();
    }
}
