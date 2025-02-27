package ads.poo;

public enum Planeta {
    MERCURIO("O menor de todos, Mercurio",1),
    VENUS("Venus nao possui luas",2),
    TERRA("Todas as vencedoras do MISS UNIVERSO são do planeta Terra",3),
    MARTE("Elon Musk prometeu que o homem viveria em Marte",4),
    JUPITER("Jupiter possui um furacão que tem 300 anos",5),
    SATURNO("Os aneis de Saturno são irados",6),
    URANO("Em ingles Uranus é engraçado",7),
    NETUNO("No planeta Netuno chovem diamantes",8);


    public final String funFact;
    public final int distanciaDoSol;

    Planeta(String funFact, int numero) {
        this.funFact = funFact;
        this.distanciaDoSol = numero;

    }

    @Override
    public String toString() {
        return "Planeta{" +
                "funFact='" + funFact + '\'' +
                ", distanciaDoSol=" + distanciaDoSol +
                "} " + super.toString();
    }
}
