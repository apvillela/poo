package org.example;

public class Arqueiro extends Humano implements Guerreiro {
    public Arqueiro() {
        super(35, 2, 1.0f);
    }

    public String atirarFlecha() {
        return "Atirando flecha";
    }

    @Override
    public String atacar() {

        return "Arqueiro atacando com a Aljava com " + this.ataque +
                " de ataque";
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Arqueiro se movendo com velocidade " + this.velocidade;
    }

}
