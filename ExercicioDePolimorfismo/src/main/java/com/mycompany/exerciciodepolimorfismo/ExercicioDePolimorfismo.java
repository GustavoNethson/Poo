/**/
package com.mycompany.exerciciodepolimorfismo;

public class ExercicioDePolimorfismo {
    public static void main(String[] args) {
                
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro();
        veiculos[1] = new Moto();
        veiculos[2] = new Aviao();
        
        for (Veiculo veiculo : veiculos){
            veiculo.Mover();
        }
    }
}
