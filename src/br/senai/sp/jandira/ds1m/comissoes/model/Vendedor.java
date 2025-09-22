package br.senai.sp.jandira.ds1m.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;
    int tempoDeEmpresa;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("** CALCULADORA DE COMISSÕES **");
        System.out.println("-----------------------------------");

        // Obtendo o nome do vendedor
        System.out.print("Qual o nome do vendedor? ");
        nomeVendedor = leitor.nextLine();

        System.out.print("Qual o tempo de empresa do vendedor? (informe em anos)");
        tempoDeEmpresa = leitor.nextInt();


        // Obtendo o total de vendas do vendedor
        System.out.print("Qual o total de vendas do(a) vendedor(a) " + nomeVendedor + "? ");
        totalDeVendas = leitor.nextDouble();

        calcularComissao();

    }

    public void calcularComissao(){
        if (tempoDeEmpresa >= 2 && totalDeVendas > 20000){
            percentualDaComissao = 10;

        } else {
            percentualDaComissao = 5;

        }

        valorDaComissaoEmReais = totalDeVendas * percentualDaComissao / 100;

        exibirResultados();

    }

    public void exibirResultados(){
        System.out.println("-------------------------------------");
        System.out.println("** R E S U L T A D O S **");
        System.out.println("-------------------------------------");
        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$" + totalDeVendas);
        System.out.println("PERCENTUAL DA COMISSÃO: " + percentualDaComissao + "%");
        System.out.println("VALOR DA COMISSÃO PAGA: R$ " + valorDaComissaoEmReais);
        System.out.println("-------------------------------------");
    }

}
