package br.ufrn.tads.poo;

import Conta.ContaBancaria;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;
import Conta.IConta;

public class Main {
    public static void main(String[] args) {

        IConta conta1 = new ContaCorrente();
        IConta conta2 = new ContaPoupanca();

        conta1.deposito(200.0);
        conta2.deposito(100.0);

        conta1.transferencia(conta2, 150.0);
        System.out.println(conta1.saldo()); // deve ser 50
        System.out.println(conta2.saldo()); // deve ser 250

        conta1.transferencia(conta2, 150.0); // essa operação não é possível
        System.out.println(conta1.saldo()); // deve permanecer 50

        conta2.transferencia(conta1, 100.0);
        System.out.println(conta1.saldo()); // deve ser 150
        System.out.println(conta2.saldo()); // deve ser 150

        conta2.transferencia(conta1, -100.0);
        System.out.println(conta1.saldo()); // deve ser 150
        System.out.println(conta2.saldo()); // deve ser 150

        conta1.saque(50.0);
        System.out.println(conta1.saldo()); // deve ser 100


    }
}
