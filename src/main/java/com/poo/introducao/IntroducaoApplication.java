package com.poo.introducao;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class IntroducaoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
	
    
		 
	//-- ex 1 --


	  
	//    int numero1 = 1;
	//    double numeroreal=2.1;
	//    double resultado = numero1 + numeroreal;
	//    System.out.println(resultado);

		
	 // -- ex 2 --


	//  String nome;
	//  String sobrenome;  

	//  System.out.println("qual seu nome?");
	//  nome = scanner.nextLine();
     
	//  System.out.println("sobrenome?");
	//  sobrenome = scanner.nextLine();

	//  System.out.println("Ola"+ " " + nome+ " " + sobrenome);



     // -- ex 3 --
     
	//  double valorreal;
	//  double dolar;
	//  double taxa = 5.25;

    //  System.out.print("digite o valor em reais:");
    //  valorreal = scanner.nextInt();

	//  dolar = valorreal * taxa;

	//  System.out.println("o valor em dolar é:"+" "+"$"+dolar);

    // -- ex 4 --

	// int numerodig;
	// int antecessor;
	// int sucessor;

	// System.out.print("digite um numero para saber o sucessor e o sucessor:");
    // numerodig = scanner.nextInt();
	// antecessor = numerodig -1;
	// sucessor = numerodig +1;

    // System.out.println(" o sucessor é:"+sucessor + " o antecessor é:"+ antecessor);

    // -- ex5 --

	// int larguraterreno;
	// int comprimentoterreno;
	// int valorpormetro;
	// int area;

    // System.out.println("tamanho terreno:");
	// larguraterreno = scanner.nextInt();
	// System.out.println("comprimento:");
	// comprimentoterreno = scanner.nextInt();
     
	// area = larguraterreno * comprimentoterreno;

	// System.out.println("qual valor do m2:");
	// valorpormetro = scanner.nextInt();
    
    //  System.out.println("valor total do terreno é;$"+(area * valorpormetro));

    //--ex6--

	// int distanciapercorrida;
	// int valortotal;
	// final double custocombustivel = 5.25;


	// System.out.print("quantos km percorrido:");
	// distanciapercorrida = scanner.nextInt();
	// System.out.print("qual o valor total na bomba:");
	// valortotal = scanner.nextInt();

	// System.out.println("Sua autonomia foi de:"+ (distanciapercorrida/(valortotal/custocombustivel))+"km/l");

    // --ex7--
    
	// double nota1, nota2,nota3,nota4,media;
    
	// System.out.print("digite a nota 1:");
	// nota1 = scanner.nextDouble();
	// System.out.print("segunda nota:");
	// nota2 = scanner.nextDouble();
	// System.out.print("nota 3:");
	// nota3 = scanner.nextDouble();
	// System.out.print("nota 4:");
	// nota4 = scanner.nextDouble();
     
	// media = (nota1 + nota2 + nota3 + nota4)/4;
	// System.out.println("A media do aluno foi:"+ media);

    // -- ex 8 --
	// double fahrenheit;
	

    // System.out.print("quantos fahrenheit:");
	// fahrenheit = scanner.nextDouble();
	// final double converter =(fahrenheit - 32)/1.8;
	// System.out.println("A temperatura em celcius é:"+converter+"°c");
    

// lista 2

int num;

System.out.print("Digite um numero:");
num = scanner.nextInt();
int parOuImpar= num %2;

if (parOuImpar == 0) {
	System.out.print("numero par!");
	
}
else{ System.out.println("numero impar!");}



	}
	}


