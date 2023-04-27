
package com.mycompany.exercicioum;

public class ExercicioUm {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(10.0);
        IngressoVIP ingressoVIP = new IngressoVIP(40.0, 20.0);

        System.out.println(ingresso.toString());
        System.out.println(ingressoVIP.toString());
    }
}

