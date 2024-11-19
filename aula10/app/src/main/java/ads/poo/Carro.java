package ads.poo;
public class Carro {
    // Atributos
    private String modelo;
    private int velocidadeAtual;
    private String cor1;
    // Métodos
    public void definirVelocidade(int v){
        velocidadeAtual = v;
    }
    public int obterVelocidade(){
        return velocidadeAtual;
    }
    public void definirModelo(String novoModelo){
        modelo = novoModelo;
    }
    public void definirCor(String novaCor){
        cor1 = novaCor;
    }
    public String obterModelo(){
        return modelo;
    }
    public String obterCor(){
        return cor1;
    }
}
