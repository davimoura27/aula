package com.poo.introducao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista04 {
    void lista04ex1() {
        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 50, 23, 68, 27 };
        double calculo = 0;
        somaTotal(vendas, calculo);
    }

    void somaTotal(double[] vendas, double calculo) {

        for (int i = 0; i < vendas.length; i++) {
            calculo = vendas[i] + calculo;

        }
        System.out.println("o total de vendas é:" + calculo + "$");
    }

    void lista04ex2() {

        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 500, 100, 12, 0.5 };
        double maior = 0;
        double menor = vendas[0];
        maiorVenda(vendas, maior, menor);
    }

    void maiorVenda(double[] toraldevendas, double maiorvenda, double menorvenda) {
        for (int i = 0; i <= 5; i++) {
            if (toraldevendas[i] > maiorvenda) {
                maiorvenda = toraldevendas[i];

            }
            if (toraldevendas[i] < menorvenda) {
                menorvenda = toraldevendas[i];

            }

        }

        System.out.println("a maior venda foi:" + maiorvenda + "$");
        System.out.println("a menor venda foi:" + menorvenda + "$");
    }

    void lista04ex3() {
        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 50, 23, 68, 27 };
        double calculo = 0;
        double tiketmedio = 0;
        tiketMedio(vendas, calculo, tiketmedio);
    }

    void tiketMedio(double[] vendas, double calculo, double tiketMedio) {
        for (int i = 0; i <= 5; i++) {
            calculo = vendas[i] + calculo;

        }
        tiketMedio = calculo / vendas.length;
        System.out.print("seu tiket medio foi:");
        System.out.format("%.2f", tiketMedio);
        System.out.println("$");

    }

    void lista04ex4() {

        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        calculaNumeroPar(lista);
    }

    void calculaNumeroPar(int[] listagem) {
        System.out.print("os numeros pares da lista são:");
        for (int i = 0; i <= 8; i++) {
            int parouimpar;
            if ((listagem[i] % 2) == 0) {
                parouimpar = listagem[i];
                System.out.print(" " + parouimpar);
            }

        }
    }

    void lista04ex5() {
        // ArrayList<Double> preco = new ArrayList<>();
        HashMap<String, String> valoresItens = new HashMap<>();
        ArrayList<String> listadeitens = new ArrayList<>();
        listaDeCompras(valoresItens);

    }

    void listaDeCompras(HashMap<String, String> valoresItens) {

        Scanner leia = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String item;
        int opção;
        double valor;
        do {
            System.out.println("--- MENU DE COMPRAS ---");
            System.out.println("1)insira um item;");
            System.out.println("2)ver lista de compras;");
            System.out.println("3)remover item;");
            System.out.println("4)adicionar preço;");
            System.out.println("5)sair.");
            System.out.print("escolha uma opção:");
            opção = leia.nextInt();

            if (opção == 1) {

                System.out.print("insira o nome do item:");

                item = sc.nextLine();
                String semValor = ":sem valor";
                valoresItens.put(item, semValor);
                System.out.println("item adicionado");
            } else if (opção == 2) {
                System.out.println("------------------");
                System.out.println("lista de compras:");

                for (int i = 0; i < valoresItens.size(); i++) {

                }
                for (Map.Entry<String, String> entry : valoresItens.entrySet()) {
                    if (entry.getValue() != null) {
                        System.out.println(entry.getKey() + ":" + entry.getValue());

                    }

                }

                System.out.println("------------------");
            } else if (opção == 3) {
                System.out.print("digite o item para remover:");
                item = sc.nextLine();
                valoresItens.remove(item);
                

            } else if (opção == 4) {
                System.out.print("insira o nome do item para receber o valor:");
                item = sc.nextLine();

                System.out.print("insira o valor do item:");
                valor = leia.nextDouble();

                // criar parse para converter valor para String
                String valorProduto = valor + "";
                valoresItens.put(item, valorProduto);

            } else {
                System.out.println("finalizando...");
            }

        } while (opção != 5);

    }
}
