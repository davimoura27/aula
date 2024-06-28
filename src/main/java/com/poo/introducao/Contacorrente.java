package com.poo.introducao;

import java.util.ArrayList;

public class Contacorrente {
    // atributos
    int numerodaconta;
    double saldo;
    String titular;
    ArrayList<Operacao> extrato = new ArrayList<>();
    // metodos
    // depositar,sacar,saldo,extrato

    void depositar(double deposito) {
        // saldo = saldo + deposito;
        saldo += deposito;
        Operacao op = new Operacao();
        op.tipo = "deposito";
        op.valor = deposito;
        op.saldoapos = saldo;
        extrato.add(op);
        System.out.println("deposito efetuado");
        System.out.println("seu novo saldo é:" + saldo);

    }

    void sacar(double saque) {
        // verificar se tem saldo
        if (saque > saldo) {
            System.out.println("saldo insuficiente");

        } else {
            saldo -= saque;
            Operacao op = new Operacao();
            op.tipo = "saque";
            op.valor = saque;
            op.saldoapos = saldo;
            extrato.add(op);
            System.out.println("saldo retirado com sucesso");
            System.out.println("seu saldo é:" + saldo);
        }

    }

    void saldo() {
        System.out.println(" saldo:" + saldo);
    }

    void extrato() {
        for (Operacao op : extrato) {
            System.out.println("Operação:" + op.tipo);
            System.out.println("valor:" + op.valor);
            System.out.println("horario:" + op.horario);
            System.out.println("saldo:" + op.saldoapos);
        }

    }

}
