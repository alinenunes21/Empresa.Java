package com.empresa;

import java.time.LocalDate;

public abstract class Funcionario {
     protected String nome;
     protected String cargo;
     protected LocalDate dataContratacao;
     protected double salarioBase;

     public Funcionario(String nome, String cargo, LocalDate dataContratacao, double salarioBase) {
          this.nome = nome;
          this.cargo = cargo;
          this.dataContratacao = dataContratacao;
          this.salarioBase = salarioBase;
     }

     public String getNome() {
          return nome;
     }

     public String getCargo() {
          return cargo;
     }

     public LocalDate getDataContratacao() {
          return dataContratacao;
     }

     public abstract double calcularSalario(int mes, int ano);

     public abstract double calcularBeneficio(int mes, int ano);

     protected int calcularAnosDeServico(int ano) {
          return ano - dataContratacao.getYear();
     }
}
