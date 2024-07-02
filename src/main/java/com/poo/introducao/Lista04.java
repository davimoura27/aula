package com.poo.introducao;

import java.util.*;

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
        HashMap<String, String> valoresItens = new HashMap<>();
        listaDeCompras(valoresItens);

    }

    public void listaDeCompras(HashMap<String, String> valoresItens) {
        Scanner string = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String item;
        double valor;

        int opção;

        do {
            System.out.println("--- MENU DE COMPRAS ---");
            System.out.println("1) Inserir um item;");
            System.out.println("2) Ver lista de compras;");
            System.out.println("3) Remover item;");
            System.out.println("4) Adicionar preço;");
            System.out.println("5) Imprimir produtos em ordem crescente de preço;");
            System.out.println("6) Sair.");
            System.out.print("Escolha uma opção: ");
            opção = in.nextInt();

            switch (opção) {
                case 1:
                    System.out.print("Insira o nome do item:");
                    item = string.nextLine();
                    valoresItens.put(item, "sem valor");
                    System.out.println("Item adicionado a lista!");
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("Lista de compras;");
                    for (Map.Entry<String, String> entry : valoresItens.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.print("Digite o item que deseja remover:");
                    item = string.nextLine();
                    valoresItens.remove(item);
                    System.out.println("item removido!");
                    break;
                case 4:
                    System.out.print("Insira o nome do item para adicionar o valor:");
                    item = string.nextLine();
                    System.out.print("Insira o valor do item:");
                    valor = in.nextDouble();
                    valoresItens.put(item, Double.toString(valor));
                    System.out.println("Valor adicionado!");
                    break;
                case 5:
                    Collection<String> valores = valoresItens.values();

                    List<String> listaValores = new ArrayList<>(valores);

                    Collections.sort(listaValores, new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            double valor1 = Double.parseDouble(o1);
                            double valor2 = Double.parseDouble(o2);
                            return Double.compare(valor1, valor2);
                        }

                    });

                    System.out.println("Produtos em ordem crescente de preç:");
                    for (String val : listaValores) {
                        for (Map.Entry<String, String> entry : valoresItens.entrySet()) {
                            if (entry.getValue().equals(val)) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                                break;

                            }
                        }
                    }
                    System.out.println("--------------------");
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção invalida. Tente novamente:");

            }

        } while (opção != 6);

    }

}
