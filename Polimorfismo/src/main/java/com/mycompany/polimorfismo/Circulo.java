package com.mycompany.polimorfismo;

class Circulo extends Forma{
    @Override
    public void desenhar(){
        System.out.println("Desenando circulo.");
    }
    
      public void desenhar(int gus){
        System.out.println("Desenando circulo."+gus);
    }
}

