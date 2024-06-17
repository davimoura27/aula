package com.poo.introducao;
import java.util.Scanner;

public class lista02 {
void exercicio01(){
Scanner sc = new Scanner(System.in);
int num;

System.out.print("Digite um numero para saber de é par ou impar:");
num = sc.nextInt();
int parOuImpar= num %2;

if (parOuImpar == 0) {
	System.out.print("numero par!");
	
}
else{ System.out.println("numero impar!");}
}

void exercicio02(){

int primeiroDigito;
int segundoDigito;
Scanner sc = new Scanner(System.in);

System.out.println("----- Bem vindo -----");
System.out.print("Digite o primeiro numero:");
primeiroDigito = sc.nextInt();
System.out.print("Digite o segundo numero:");
segundoDigito = sc.nextInt();

if (primeiroDigito > segundoDigito) {
    System.out.println(primeiroDigito + " " + "é o maior numero!");
}
else if (segundoDigito > primeiroDigito) {
    System.out.println(segundoDigito + " " + "é o numero maior!");
    
}
else { System.out.println("Numeros iguais!");}
}


}






