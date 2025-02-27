package ads.poo;

public enum Naipe {
    OUROS("Ouros",1),
    ESPADAS("Espadas",2),
    COPAS("Copas",3),
    PAUS("Paus",4);

    private final String naipe;
    private final int forca;

    Naipe(String naipe, int forca) {
        this.naipe = naipe;
        this.forca = forca;
    }
}
