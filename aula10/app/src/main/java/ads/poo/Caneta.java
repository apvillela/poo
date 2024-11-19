package ads.poo;

public class Caneta {
    private String cor;
    public int quantidadeDeTinta = 100;

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public String desenhar(int distancia) {

        if (distancia > quantidadeDeTinta) {
            return "Impossível desenhar essa distância";
        }

        quantidadeDeTinta = quantidadeDeTinta - distancia;
        return "Desenhado " + distancia + "cm com a cor " + cor + " (Tinta sobrando " + quantidadeDeTinta + ")";
    }

}
