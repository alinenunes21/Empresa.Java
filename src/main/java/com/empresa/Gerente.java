package com.empresa;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    public Gerente(String nome, LocalDate dataContratacao) {
        super(nome, "Gerente", dataContratacao, 20000.0);
    }

    public double calcularSalario(int mes, int ano) {
        int anosDeServico = calcularAnosDeServico(ano);
        return salarioBase + 3000 * anosDeServico;
    }

    public double calcularBeneficio(int mes, int ano) {
        return 0.0;
    }
}
