package com.empresa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicialização dos dados
        Secretario secretario1 = new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1));
        Secretario secretario2 = new Secretario("Maria Souza", LocalDate.of(2015, 12, 1));
        Vendedor vendedor1 = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1));
        Vendedor vendedor2 = new Vendedor("João Mendes", LocalDate.of(2021, 12, 1));
        Gerente gerente1 = new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1));
        Gerente gerente2 = new Gerente("Bento Albino", LocalDate.of(2014, 3, 1));

        // Registrar vendas
        vendedor1.registrarVendas(2021, 12, 5200.0);
        vendedor1.registrarVendas(2022, 1, 4000.0);
        vendedor1.registrarVendas(2022, 2, 4200.0);
        vendedor1.registrarVendas(2022, 3, 5850.0);
        vendedor1.registrarVendas(2022, 4, 7000.0);

        vendedor2.registrarVendas(2021, 12, 3400.0);
        vendedor2.registrarVendas(2022, 1, 7700.0);
        vendedor2.registrarVendas(2022, 2, 5000.0);
        vendedor2.registrarVendas(2022, 3, 5900.0);
        vendedor2.registrarVendas(2022, 4, 6500.0);

        // Criação de listas de funcionários e vendedores
        List<Funcionario> funcionarios = Arrays.asList(secretario1, secretario2, vendedor1, vendedor2, gerente1, gerente2);
        List<Vendedor> vendedores = Arrays.asList(vendedor1, vendedor2);

        // Instanciação de folha de pagamento e seus métodos
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        int mes = 4;
        int ano = 2022;

        double totalPago = folhaDePagamento.calcularTotalPago(funcionarios, mes, ano);
        double totalSalarios = folhaDePagamento.calcularTotalSalarios(funcionarios, mes, ano);
        double totalBeneficios = folhaDePagamento.calcularTotalBeneficios(funcionarios, mes, ano);
        Funcionario funcionarioComMaiorRecebimento = folhaDePagamento.calcularFuncionarioComMaiorRecebimento(funcionarios, mes, ano);
        Funcionario funcionarioComMaiorBeneficio = folhaDePagamento.calcularFuncionarioComMaiorBeneficio(funcionarios, mes, ano);
        Vendedor vendedorComMaiorVenda = folhaDePagamento.calcularVendedorComMaiorVenda(vendedores, mes, ano);

        System.out.println("Total pago (salários + benefícios): " + totalPago);
        System.out.println("Total pago em salários: " + totalSalarios);
        System.out.println("Total pago em benefícios: " + totalBeneficios);
        System.out.println("Funcionário com maior recebimento: " + (funcionarioComMaiorRecebimento != null ? funcionarioComMaiorRecebimento.getNome() : "N/A"));
        System.out.println("Funcionário com maior benefício: " + (funcionarioComMaiorBeneficio != null ? funcionarioComMaiorBeneficio.getNome() : "N/A"));
        System.out.println("Vendedor com maior venda: " + (vendedorComMaiorVenda != null ? vendedorComMaiorVenda.getNome() : "N/A"));
    }
}
