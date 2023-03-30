package com.mycompany.aula29032023;
import java.util.Date;
public class Aula29032023 {

    public static void main(String[] args) {
        Aluno i = new Aluno ("Jose Francisco", "123.456.789.00", new Date(), matricula "ADS");
        System.out.println("Veja como os atributos foram preenchhidos\n\nNome: " +i.nome);
        System.out.println("CPF: " +i.cpf);
        System.out.println("Data de nascimento: " +i.data_nascimento.toString());
        
        Professor p = new Professor (_nome "Edinaldo Pereira", _cpf "159.258.357.45", new Date(), salario "2,00", disciplina "POO");
        System.out.println("Veja como os atributos foram preenchhidos\n\nNome: " +p.nome);
        System.out.println("CPF: " +p.cpf);
        System.out.println("Data de nascimento: " +p.data_nascimento.toString());
        
        Funcionario f = new Funcionario (_nome "Charlinho ribeiro", _cpf "400.289.220.03", new Date(), salario "1,59", data_admissao "ontem", cargo "Café" );
        System.out.println("Veja como os atributos foram preenchhidos\n\nNome: " +f.nome);
        System.out.println("CPF: " +f.cpf);
        System.out.println("Data de nascimento: " +f.data_nascimento.toString());
    }
}