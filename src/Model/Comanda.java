package Model;

public class Comanda {
    private String pedidos;
    int quantidade;

    public Double calculaPreco() {
        Double total = Double.valueof(0);
        for(int i; i<pedidos.length; i++){
            Pedido um = pedidos[i];
            total+=um.calculaPreco();
        }
        return total;
    }

    Comanda
}
