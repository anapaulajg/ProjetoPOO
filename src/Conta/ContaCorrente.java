package Conta;

public class ContaCorrente extends ContaBancaria {
    Double chequeEspecial = 1000.;


    @Override
    public void transferencia(IConta destino, Double valor) {
        if (valor <= saldo + chequeEspecial && valor > 0){
            this.saque(valor);
            destino.deposito(valor);
        }
    }

    @Override
    public void saque(Double valor) {
        if (this.saldo + chequeEspecial >= valor && valor > 0 && valor <= 2000)
            this.saldo -= valor;
    }

    public void pagamento(Double valor) {
        this.saque(valor);
    }
}
