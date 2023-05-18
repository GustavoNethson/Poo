/**/
package com.mycompany.exerciciodepolimorfismo;

public class ExercicioDePolimorfismo {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Carro();
        veiculo.Mover();
        
        veiculo = new Moto();
        veiculo.Mover();
        
        veiculo = new Aviao();
        veiculo.Mover();
    }
}
