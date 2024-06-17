package com.poo.introducao;

import java.util.Scanner;

public class lista {

void ex01() {
	
	int numero1;
	int numero2;
	int resultado;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("------- Bem vindo! -------");
	System.out.print("Digite o primeiro numero a ser multiplicado:");
	numero1 = sc.nextInt();
	System.out.print("Digite o segundo numero a ser multiplicado:");
	numero2 = sc.nextInt();
	
	resultado = numero1 + numero2;
	System.out.print("O resultado da soma foi:"+resultado);

}
void ex02(){
	 
	 String nome;
	 String sobrenome;  
     Scanner sc = new Scanner(System.in);

	 System.out.println("------- Bem vindo! -------");
	 System.out.print("Digite seu primeiro nome:");
	 nome = sc.nextLine();
     
	 System.out.print("Digite seu sobrenome:");
	 sobrenome = sc.nextLine();

	 System.out.println("Ola,"+ " " + nome+ " " + sobrenome + "!");


}
void ex03(){

    
	double valorReal;
	double dolar;
	final double taxa = 5.25;
	Scanner sc = new Scanner(System.in);

	System.out.println("------- Bem vindo! -------");
    System.out.print("Digite o valor em reais:R$");
    valorReal = sc.nextInt();

	dolar = valorReal / taxa;

	System.out.println("O valor em dolar é:"+" "+"U$"+dolar);


}
void ex04(){
	

	int numerodig;
	int antecessor;
	int sucessor;
	Scanner sc = new Scanner(System.in);

	System.out.println("------- Bem vindo! -------");
	System.out.print("Digite um numero para saber o antecessor e o sucessor:");

    numerodig = sc.nextInt();
	antecessor = numerodig -1;
	sucessor = numerodig +1;

	System.out.println(" O antecessor é:" + antecessor);
    System.out.println(" O sucessor é:" + sucessor );
	

}
void ex05(){

	int larguraTerreno;
	int comprimentoTerreno;
	int valorPorMetro;
	int area;
	Scanner sc = new Scanner(System.in);

	System.out.println("------- Bem vindo! -------");
    System.out.print("Digite a largura do terreno:");
	larguraTerreno = sc.nextInt();
	System.out.print("Digite o comprimento do terreno:");
	comprimentoTerreno = sc.nextInt();
     
	area = larguraTerreno * comprimentoTerreno;

	System.out.print("Digite o valor do m2 em sua região:R$");
	valorPorMetro = sc.nextInt();
    
    System.out.println("Valor total do terreno é;R$"+(area * valorPorMetro));

}
void ex06(){

	int distanciaPercorrida;
	int valorTotal;
	final double custoCombustivel = 5.25;
	Scanner sc = new Scanner(System.in);
    
	System.out.println("------- Bem vindo a calculadora de autonomia -------");	
	System.out.print("km percorrido:");
	distanciaPercorrida = sc.nextInt();
	System.out.print("Valor total na bomba:");
	valorTotal = sc.nextInt();

	System.out.println("Sua autonomia foi de:"+ (distanciaPercorrida/(valorTotal/custoCombustivel))+"km/l");


}
void ex07(){

    
	double nota1, nota2,nota3,nota4,media;
    Scanner sc = new Scanner(System.in);

	System.out.println("------- Bem vindo! -------");
	System.out.print("Digite a nota do primeiro bimestre:");
	nota1 = sc.nextDouble();
	System.out.println("-----------------------------------------------");
	System.out.print("Digite a nota do segundo bimestre:");
	nota2 = sc.nextDouble();
	System.out.println("-----------------------------------------------");
	System.out.print("Digite a nota do terceiro bimestre:");
	nota3 = sc.nextDouble();
	System.out.println("-----------------------------------------------");
	System.out.print("Digite a nota do quarto bimestre:");
	nota4 = sc.nextDouble();
	System.out.println("-----------------------------------------------");
     
	media = (nota1 + nota2 + nota3 + nota4)/4;
	System.out.println("A media do aluno foi:"+ media);

}
void ex08(){
  
   
	double fahrenheit;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("------- Bem vindo! -------");
    System.out.print("Digie os graus em fahrenheit:°F");
	fahrenheit = sc.nextDouble();
	final double converter =(fahrenheit - 32)/1.8;
	System.out.println("A temperatura em celcius é:°C"+converter);
    	
}
}
