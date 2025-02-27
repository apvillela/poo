package org.example;

public class Cavaleiro extends Humano implements Guerreiro {

    public Cavaleiro() {
        super(50, 5, 1.2f);
    }

    @Override
    public String atacar() {

        return "Cavaleiro atacando com o Cavalo com " + this.ataque +
                " de ataque";
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Cavaleiro se movendo com velocidade " + this.velocidade;
    }
}
