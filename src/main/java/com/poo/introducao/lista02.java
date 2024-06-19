package com.poo.introducao;

import java.util.Scanner;

public class lista02 {
    void exercicio01() {

        int num;

        System.out.print("Digite um numero para saber se é par ou impar:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int parOuImpar = num % 2;

        if (num == 0) {
            System.out.println("numero é zero");

        } else if (parOuImpar == 0) {
            System.out.print("numero par!");

        } else {
            System.out.println("numero impar!");
        }
    }

    void exercicio02() {

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
        } else if (segundoDigito > primeiroDigito) {
            System.out.println(segundoDigito + " " + "é o numero maior!");

        } else {
            System.out.println("Numeros iguais!");
        }
    }

    void exercicio03() {

        String idade;
        String gestante;
        String especiais;
        Scanner leia = new Scanner(System.in);

        System.out.print("Você tem 65 anos ou mais? S/N:");
        idade = leia.nextLine();

        if (idade.equalsIgnoreCase("s")) {
            System.out.print("Fila preferencial");
        } else {
            System.out.print("Você é gestante? S/N:");
            gestante = leia.nextLine();

            if (gestante.equalsIgnoreCase("s")) {
                System.out.print("Fila preferencial");
            } else {
                System.out.print("Você é portador de necessidadeds epeciais? S/N:");
                especiais = leia.nextLine();

                if (especiais.equalsIgnoreCase("s")) {
                    System.out.print("Fila preferencial");
                } else {
                    System.out.print("siga para fila comum");

                }
            }
        }

    }

    void exercicio04() {

        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("entrada não permitida!");

        } else if (idade >= 16 && idade < 18) {
            System.out.println("entrada somente com responsavel");

        } else {
            System.out.println("entrada liberada");
        }

    }

    void exercicio05() {
        final String login = "davi";
        final String senha = "123";
        Scanner scstring = new Scanner(System.in);

        String logindigitado;
        String senhadigitada;
        System.out.print("login:");
        logindigitado = scstring.nextLine();
        System.out.print("senha:");
        senhadigitada = scstring.nextLine();
        if ((logindigitado.equals(login)) && (senhadigitada.equals(senha))) {
            System.out.println("bem vindo!");
        } else {
            if (!(logindigitado.equals(login)) && !(senhadigitada.equals(senha))) {
                System.out.println("login e senha incorretos!");
            } else if (!logindigitado.equals(login)) {
                System.out.println("login incorreto");
            } else {
                System.out.println("senha incorreta!");
            }

        }

    }

    void exercicio06() {

        Double nota1, nota2, media, recuperacao;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Parabens aprovado!");

        } else {
            System.out.println("media:" + media);
            System.out.print("nota de recuperação:");
            recuperacao = sc.nextDouble();
            if ((nota1 > nota2) && (recuperacao > nota2)) {
                media = (nota1 + recuperacao) / 2;
            } else if ((nota2 > nota1) && (recuperacao > nota1)) {
                media = (nota2 + recuperacao) / 2;

            }
            if (media >= 6) {
                System.out.println("Parabens aprovado!");

            } else {
                System.out.println("reprovado");
            }
        }

    }

    void exercicio07() {
        int dividendo;
        int divisor;
        int resto;
        int resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero para dividirmos:");
        dividendo = sc.nextInt();
        System.out.print("digite o divisor");
        divisor = sc.nextInt();

        resto = dividendo % divisor;
        resultado = dividendo / divisor;

        if (resto == 0) {
            System.out.println(dividendo + " é divisivel por " + divisor);

        } else {
            System.out.println(" nao é possivel dividir");
        }
    }

    void exercicio08() {
        int chance = 3;
        int resposta1, resposta2, resposta3, resposta4, resposta5;
        Scanner sc = new Scanner(System.in);

        System.out.println("a)Quem descobriu o brasil?");
        System.out.println("1) Pedro Vieira");
        System.out.println("2) Pedro Alvares Cabral");
        System.out.println("3) Pedro Santos");
        resposta1 = sc.nextInt();

        if (resposta1 != 2) {
            chance--;
            System.out.println("errado! restam" + " " + chance);
        }
        System.out.println("B)Que time conquistou a libertadores de 2000?");
        System.out.println("1) Flamengo");
        System.out.println("2) Vasco");
        System.out.println("3) Nenhuma das anteriores");
        resposta2 = sc.nextInt();

        if (resposta2 != 2) {
            chance--;
            System.out.println("errado! restam" + " " + chance);
        }

        System.out.println("C)Qual o maior artilheiro do brasilierão de todos os tempos?");
        System.out.println("1) Zico");
        System.out.println("2) Roberto Carlos");
        System.out.println("Nenhum deles");
        resposta3 = sc.nextInt();

        if (resposta3 != 2) {
            chance--;
            System.out.println("errado! restam" + " " + chance);
        }

        System.out.println("D)Qual as cores primarias?");
        System.out.println("1) Azul, verde e roxo");
        System.out.println("2) Azul, vermelho e amarelo");
        System.out.println("Nenhuma delas");
        resposta4 = sc.nextInt();

        if (resposta4 != 2) {
            chance--;
            System.out.println("voce perdeu");
        } else {

            if (chance == 0) {

            }

            System.out.println("E)Quem foi a primeira pessoa a pisar na lua?");
            System.out.println("1) Yuri Gagarin");
            System.out.println("2) Neil Armstrong");
            System.out.println("3) Nenhuma delas");
            resposta5 = sc.nextInt();

            if (resposta5 != 2) {
                System.out.println("voce perdeu");

            } else {
                System.out.println("voce venceu");
            }

        }
    }
}