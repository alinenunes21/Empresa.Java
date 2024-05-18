package com.empresa;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Funcionario {
    private Map<YearMonth, Double> vendasMensais;

    public Vendedor(String nome, LocalDate dataContratacao) {
        super(nome, "Vendedor", dataContratacao, 12000.00);
        vendasMensais = new HashMap<>();
    }

    public void registrarVendas(int ano, int mes, double valor) {
        vendasMensais.put(YearMonth.of(ano, mes), valor);
    }

    public double calcularSalario(int mes, int ano) {
        int anosDeServico = calcularAnosDeServico(ano);
        return salarioBase + 1800 * anosDeServico;
    }

    public double calcularBeneficio(int mes, int ano) {
        YearMonth ym = YearMonth.of(ano, mes);
        return vendasMensais.getOrDefault(ym, 0.0) * 0.30;
    }

    public Map<YearMonth, Double> getVendasMensais() {
        return vendasMensais;
    }
}
