package com.mycompany.exerciciodois;

public class Exerciciodois {
        Empregado empregado = new Empregado("Paulu Brificado", 15000.0);
        Gerente gerente = new Gerente("Bruxu passeios", 150000.0, "Vendas");
        Vendedor vendedor = new Vendedor("Cuca Beludo", 15000.0, 0.1);

        System.out.println(empregado.toString());
        System.out.println(gerente.toString());
        System.out.println(vendedor.toString());
}
