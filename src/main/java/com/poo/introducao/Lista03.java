package com.poo.introducao;

import java.util.Scanner;

public class Lista03 {
    void lista03ex1() {
        int segundos;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite quantos segudos:");
        segundos = leia.nextInt();

        for (int inicio = 0; inicio <= segundos; inicio++) {
            if (segundos >= 60) {
                System.out.print("digite um numero entre 0 e 59:");
                segundos = leia.nextInt();
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

    void lista03ex3(){
        int primeiro, segudo;
         Scanner leia = new Scanner(System.in); 
        System.out.print("Digite o primeiro numero:");
         primeiro = leia.nextInt();
         System.out.print("Digite o segundo numero:");
         segudo = leia.nextInt();
         System.out.print("os numeros pares entre"+ " " + primeiro + " " +  "e " + segudo + " são:" );
         while (primeiro <= segudo) {
          
          if ((primeiro % 2)==0) {
            System.out.print( primeiro + ",");
           
          }
         
          primeiro++;
         }
        
    }
}
