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
		// lista lista = new lista();
		// lista.ex03();
		// lista02 segundaLista = new lista02();
		// segundaLista.exercicio08();
		Lista03 terLista = new Lista03();
		terLista.lista03ex6();
		// Lista04 quarLista = new Lista04();
		// quarLista.lista04ex5();
		// Contacorrente contadoyuri = new Contacorrente();
		// contadoyuri.depositar(1000);
		// contadoyuri.sacar(1200);
		// contadoyuri.extrato();

	}

}
