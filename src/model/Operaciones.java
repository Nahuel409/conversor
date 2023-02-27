/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Operaciones {
    private int divisa;
    private double valor;
    private int divisaResultado;
    
    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setDivisaResultado(int divisaResultado) {
        this.divisaResultado = divisaResultado;
    } 
    /*dolar a euro 0.94
    euro a dolar  1.06
    arg 0.0051dolar, 0.0048euros... inversa 196.79usd   208.64eur
    */
   
     public double [][]monedas={
         {1.0, 0.94, 196.79},
         {1.06, 1.0, 208.64},
         {0.0051, 0.0048, 1.0}
     };
 
    public double conversion(){
    double resultado = 0.0;
    if(divisa == divisaResultado){
    resultado = valor;
    }else{
    resultado = valor * monedas[divisa][divisaResultado];
    }
    return resultado;
    }
  
    
}

   















 


