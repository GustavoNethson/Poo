package com.mycompany.exercicioum;

class Cachorro extends Animal {
    @Override
    public void emitirSom(){
      System.out.println("O cachorro latiu");
    }
    
    public void mover(){
        System.out.println("correndo");
    }
}
