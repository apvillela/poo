package ads.poo;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Tabuleiro {
    private double x;
    private double y;
    private double tamanhoDoLado;
    private int quantidadeDeLinhas;
    private int quantidadeDeColunas;
    
    public Tabuleiro(double x, double y, double tamanhoDoLado, int quantidadeDeLinhas, int quantidadeDeColunas) {
        this.x = x;
        this.y = y;
        this.tamanhoDoLado = tamanhoDoLado;
        this.quantidadeDeLinhas = quantidadeDeLinhas;
        this.quantidadeDeColunas = quantidadeDeColunas;
    }

    public void plotarTabuleiro(Draw draw){
        
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            
            
            for (int j = 0; j < quantidadeDeColunas; j++) {
                
                draw.square(x*(j+tamanhoDoLado), y, tamanhoDoLado);

                
            }
            
        }

        

    }

    
}
