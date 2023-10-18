package model;

public class Investimento
{
 private float meses;
 private float juros;
 private float deposito_mensal;

 public Investimento(float a, float j, float dm) {
 meses = a;
 juros = j/100;
 deposito_mensal = dm;
 }

 public float calculaTotal() {
 float num_pagamentos = meses;
 float total = 0;
 for (int i = 0; i < num_pagamentos; i++) {
 total = total + deposito_mensal;
 total = total + total * juros;
 }
 
 return total;
 }
}
