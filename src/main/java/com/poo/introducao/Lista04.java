package com.poo.introducao;

import java.util.Scanner;

public class Lista04 {
    void lista04ex1() {
        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 50, 23, 68, 27 };
        double calculo = 0;

        for (int i = 0; i <= 5; i++) {
            calculo = vendas[i] + calculo;

        }
        System.out.println("o total de vendas é:" + calculo + "$");

    }

    void lista04ex2() {

        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 500, 100, 12, 0.5 };
        double maior = 0;
        double menor = vendas[0];

        for (int i = 0; i <= 5; i++) {
            if (vendas[i] > maior) {
                maior = vendas[i];

            }
            if (vendas[i] < menor) {
                menor = vendas[i];

            }

        }

        System.out.println("a maior venda foi:" + maior + "$");
        System.out.println("a menor venda foi:" + menor + "$");
    }

    void lista04ex3() {
        Scanner leia = new Scanner(System.in);
        double[] vendas = { 10, 1.20, 50, 23, 68, 27 };
        double calculo = 0;
        double tiketMedio;
        for (int i = 0; i <= 5; i++) {
            calculo = vendas[i] + calculo;
           

            
        } tiketMedio = calculo / vendas.length;
        System.out.print("seu tiket medio foi:");
       System.out.format("%.2f", tiketMedio );
        System.out.println("$");
       

    }
}
