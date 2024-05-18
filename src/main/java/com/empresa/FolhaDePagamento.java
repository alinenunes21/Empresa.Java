package com.empresa;

import java.time.YearMonth;
import java.util.Comparator;
import java.util.List;

public class FolhaDePagamento {
    public double calcularTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
                .mapToDouble(f -> f.calcularSalario(mes, ano) + f.calcularBeneficio(mes, ano))
                .sum();
    }

    public double calcularTotalSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
                .mapToDouble(f -> f.calcularSalario(mes, ano))
                .sum();
    }

    public double calcularTotalBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
                .filter(f -> f.calcularBeneficio(mes, ano) > 0)
                .mapToDouble(f -> f.calcularBeneficio(mes, ano))
                .sum();
    }

    public Funcionario calcularFuncionarioComMaiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
                .filter(f -> f.calcularBeneficio(mes, ano) > 0)
                .max(Comparator.comparingDouble(f -> f.calcularBeneficio(mes, ano)))
                .orElse(null);
    }

    public Vendedor calcularVendedorComMaiorVenda(List<Vendedor> vendedores, int mes, int ano) {
        YearMonth ym = YearMonth.of(ano, mes);
        return vendedores.stream()
                .max(Comparator.comparingDouble(v -> v.getVendasMensais().getOrDefault(ym, 0.0)))
                .orElse(null);
    }

    public Funcionario calcularFuncionarioComMaiorRecebimento(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
                .max(Comparator.comparingDouble(f -> f.calcularSalario(mes, ano) + f.calcularBeneficio(mes, ano)))
                .orElse(null);
    }
}
