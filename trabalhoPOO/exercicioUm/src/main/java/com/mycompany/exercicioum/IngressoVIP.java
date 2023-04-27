package com.mycompany.exercicioum;

public class IngressoVIP extends Ingresso{
    private double valorAdicional; 
       
    public IngressoVIP(double _valor, double valAdicional){
            super(_valor);
            this.valorAdicional = valAdicional;
    }

       public double getValorAdicional(){
           return valorAdicional;
       } 
       
    public void setValAdicional(double valAdicional) {
        this.valorAdicional = valAdicional;
    }
}
