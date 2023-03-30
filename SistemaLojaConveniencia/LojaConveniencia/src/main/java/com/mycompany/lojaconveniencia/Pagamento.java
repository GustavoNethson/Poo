package com.mycompany.lojaconveniencia;

public class Pagamento {
    //Atributos da classe junto com os seus tipos.
    public String tipoCartao;
    private double numCartao;
    private int validadeCartao;
    private int codSeguranca;
    private int digitarSenha;
    public String statusPagamento;
    
    //Constutor da classe com seus atributos devidademente definidos.
    public void PagamentoCartao(String tipo, double num, int validade, int cod, int senha, String status){
        tipoCartao = tipo;
        numCartao = num;
        validadeCartao = validade;
        codSeguranca = cod;
        digitarSenha = senha;
        statusPagamento = status;
    }
    
    public String getTipo(int tipo){
        if (tipo == 1) {
        return "Debito";   
        } else if (tipo == 2) {
        return "Crédito";
        } else {
        return "Tipo invalido";
        }
    }
    
    public String getNum(){
        return "Numero: " + numCartao;
    }
    
    public String getValidade(){
        return "Validade : " + validadeCartao;
    }
    
    public String getCod(){
        return "Codigo de SEgurança: " + codSeguranca;
    }
    
    public String getSenha(){
        return "Senha: " + digitarSenha;
    }
    
    public String getStatus(){
        return "Situação: " + statusPagamento;
    }
    
    
    
}