package ads.poo;

import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Circulo {
    private double x;
    private double y;
    private Color cor;
    private double raio;
    
    public Circulo(double x, double y, Color cor, double raio) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.raio = raio;
    }
    public void desenhar(Draw draw){
        
        draw.setPenColor(this.cor);
        draw.circle(this.x,this.y,this.raio);
        draw.setPenColor(Draw.BLACK);

    }
    

}
