package com.poo.introducao;

import java.util.Scanner;

public class Lista03 {
    void lista03ex1() {
        int segundos;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite quantos segudos:");
        segundos = leia.nextInt();

        for (int inicio = segundos; inicio >= 0; inicio--) {
            if (segundos >= 60) {
                System.out.print("numero invalido! digite um numero entre 0 e 59:");
                segundos = leia.nextInt();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(inicio + ",");
        }

    }

    void lista03ex2() {
        int multiplicador;
        int numeroParaSerMultiplicado;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o numero para multiplicar:");
        multiplicador = leia.nextInt();
        System.out.print("digite o primeiro numero para ser multiplicado:");
        int inicioMultiplicar = leia.nextInt();
        System.out.print("digie até qual numero deseja multiplicar:");
        numeroParaSerMultiplicado = leia.nextInt();
        int tabuada;
        while (inicioMultiplicar <= numeroParaSerMultiplicado) {
            tabuada = inicioMultiplicar * multiplicador;

            System.out.println(multiplicador + "x" + inicioMultiplicar + "=" + tabuada);
            inicioMultiplicar++;
        }

    }

    void lista03ex3() {
        int primeiro, segudo;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
        primeiro = leia.nextInt();
        System.out.print("Digite o segundo numero:");
        segudo = leia.nextInt();
        System.out.print("os numeros pares entre" + " " + primeiro + " " + "e " + segudo + " são:");
        while (primeiro <= segudo) {

            if ((primeiro % 2) == 0) {
                System.out.print(primeiro + ",");

            }

            primeiro++;
        }

    }

    void lista03ex4() {

        int numeroAdvinhar;
        int advinhador;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero para ser advinhado:");
        numeroAdvinhar = leia.nextInt();

        do {
            System.out.print("advinhe o numero digitado:");
            advinhador = leia.nextInt();
            if (advinhador == numeroAdvinhar) {

                System.out.println("parabens, voce acertou!");

            } else {
                if ((advinhador - numeroAdvinhar) >= 6) {
                    System.out.println("ta frio! numero muito alto!");
                } else if ((advinhador - numeroAdvinhar) <= -6) {
                    System.out.println("ta frio! numero muito baixo!");
                } else if (((advinhador - numeroAdvinhar) <= 5) && ((advinhador - numeroAdvinhar) >= 1)) {
                    System.out.println("ta quente! numero maior");
                } else if (((advinhador - numeroAdvinhar) >= -5) && ((advinhador - numeroAdvinhar) <= -1)) {
                    System.out.println("ta quente! numero menor");

                }
                System.out.print("tente novamente, ");
            }

        }

        while (advinhador != numeroAdvinhar);

    }

}
