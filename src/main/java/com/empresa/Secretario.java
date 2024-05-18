package com.empresa;

import java.time.LocalDate;

public class Secretario extends Funcionario {
    public Secretario(String nome, LocalDate dataContratacao) {
        super(nome, "Secretário", dataContratacao, 7000.00);
    }

    public double calcularSalario(int mes, int ano) {
        int anosDeServico = calcularAnosDeServico(ano);
        return salarioBase + 1000 * anosDeServico;
    }

    public double calcularBeneficio(int mes, int ano) {
        return calcularSalario(mes, ano) * 0.20;
    }
}
