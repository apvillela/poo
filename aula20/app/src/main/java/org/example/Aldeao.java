package org.example;

public class Aldeao extends Humano
        implements Guerreiro, Coletador {
    public Aldeao() {
        super(25, 1, 0.8f);
    }

    @Override
    public String atacar() {

        return "Aldeão atacando com a Picareta com " + this.ataque +
                " de ataque";
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Aldeão se movendo com velocidade " + this.velocidade;
    }

    @Override
    public String coletarMadeira() {
        return "Coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "coletando ouro";
    }

}
