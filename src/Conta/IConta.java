package Conta;

public interface IConta {
        Double saldo();
        void transferencia(IConta destino, Double valor);
        void saque(Double valor);
        void deposito(Double valor);

}
