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
	//  lista lista = new lista();
	//  lista.ex08();
	 lista02 segundaLista = new lista02();
	 segundaLista.exercicio02();
	}
		 
	
	}
	