
package com.mycompany.aula29032023;

import java.util.Date;

public class Professor extends Pessoa{
    public Professor(String _nome, String _cpf, Date _data, String _salario, String _disciplina){
    super(_nome, _cpf, _data);
    }    
    public String salario;
    public String disciplina;
    
}    
