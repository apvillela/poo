package ads.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class App {
    private Draw draw;

    public App() {
        this.draw = new Draw();
        this.draw.setCanvasSize(1000,1000);
        this.draw.setXscale(0,1000);
        this.draw.setYscale(0,1000);
    }

    public static void main(String[] args) {
        App app = new App();
       

        // Color verde = new Color(50,160,65);
        // Color vermelho = new Color(200,25,30);
        // Circulo circuloMaker = new Circulo(310, 150, verde, 40);
        // circuloMaker.desenhar(app.draw);
        // app.draw.circle(300,150,100);
        // app.draw.setPenColor(verde);
        // app.draw.filledRoundRectangle(600,300,150,150,0,0);




        Tabuleiro tabuleiro = new Tabuleiro(50, 50, 10, 4, 5);
        tabuleiro.plotarTabuleiro(app.draw);
    }
}
