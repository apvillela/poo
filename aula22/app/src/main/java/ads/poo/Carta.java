package ads.poo;

public class Carta {

    private ValorCarta valor;
    private Naipe naipe;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return valor +
                " " + naipe;
    }
}
