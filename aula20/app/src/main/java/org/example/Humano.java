package org.example;

public abstract class Humano {

    protected int vida;
    protected int ataque;
    protected float velocidade;
    protected boolean vivo;

    public Humano(int vida, int ataque, float velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
        this.vivo = true;
    }

    public abstract String mover();

}
