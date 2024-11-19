package org.example;

public class Carro {
    private int velocidadeAtual;
    private final int VELOCIDADADE_MAX;
    private int aceleracao;
    private final String modelo;
    private int drift;
    private int altura;
    private int temperatura;

    public Carro(int velocidadeAtual, int vELOCIDADADE_MAX, int aceleracao, String modelo, int drift, int altura,
            int temperatura) {
        this.velocidadeAtual = 0;
        
        this.acelerar(velocidadeAtual);
        VELOCIDADADE_MAX = vELOCIDADADE_MAX;
        this.aceleracao = aceleracao;
        this.modelo = modelo;
        this.drift = drift;
        this.altura = altura;
        this.temperatura = temperatura;    
    }

    public void acelerar(int a) {
    Math.max((Math.min(velocidadeAtual+a,VELOCIDADADE_MAX)),0);
    }
    
    public void frear(int f) {
        if (velocidadeAtual - f >= 0) {
            velocidadeAtual = 0;
        } else
            velocidadeAtual -= f;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

}
