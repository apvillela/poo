package ads.poo;

public class Contador {

    private int valorAtual = 0;

    public void definirValor(int novoValor){
        valorAtual = novoValor;
    }

    public void incrementarValor(){
        valorAtual++;
    }
    public int getValorAtual(){
        return valorAtual;
    }
    public String getFormatValorAtual(){
        return String.format("%04d", valorAtual);
    }

}
