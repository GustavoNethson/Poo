
package com.mycompany.exerciciodois;

public class Vendedor extends Empregado {
    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return (float) (salario * (1 + percentualComissao));
    }

    public String toString() {
        return "Nome: " + nome + ", Salário sem comissão: R$" + salario +
                ", Salário com comissão: R$" + calcularSalario() +
                ", Percentual de comissão: " + percentualComissao;
    }   
}
