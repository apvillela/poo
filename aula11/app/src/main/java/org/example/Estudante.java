package org.example;

public class Estudante {
    private int qi;
    private int elo;
    private int idade;
    private static int total = 0;
    
    public Estudante(int qi, int elo, int idade) {
        this.qi = qi;
        this.elo = elo;
        this.idade = idade;
        total++;
    }

    public int getQi() {
        return qi;
    }

    public void setQi(int qi) {
        this.qi = qi;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String toString(){
        return "QI: " + this.qi + "\nELO: " + this.elo + "\nIdade: " + this.idade;
    }

    public static int getTotal() {
        return total;
    }
    
}
