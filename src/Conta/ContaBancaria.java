package Conta;

public class  ContaBancaria implements IConta {
    Double saldo = 0.0;

    @Override
    public Double saldo() {

        return saldo;
    }

    @Override
    public void transferencia(IConta destino, Double valor) {
    if (this.saldo>=valor && valor > 0){
        this.saque(valor);
        destino.deposito(valor);

    }
    }

    @Override
    public void saque(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }
    @Override
    public void deposito(Double valor) {
        if (valor > 0){
                this.saldo += valor;
            }
        }
    }



