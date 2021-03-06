package Conta;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void transferencia(IConta destino, Double valor) {
        if (this.saldo >= valor && valor > 0 && valor <= 500){
        this.saque(valor);
        destino.deposito(valor);
        }

    }

    @Override
    public void saque(Double valor) {
        if (this.saldo >= valor && valor > 0 && valor <= 500)
            this.saldo -= valor;
    }

}
