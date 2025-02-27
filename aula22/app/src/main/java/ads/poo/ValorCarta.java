package ads.poo;

import java.util.Queue;

public enum ValorCarta {
    AS("As",1),
    DOIS("Dois",2),
    TRES("Tres",3),
    QUARTO("Quatro",4),
    CINCO("Cinco", 5),
    SEIS("Seis",6),
    SETE("Sete",7),
    OITO("Oito",8),
    NOVE("Nove",9),
    DEZ("Dez",10),
    VALETE("Valete",11),
    DAMA("Dama",12),
    REI("Rei",13);

    private String valor;
    private int valorCarta;

    ValorCarta(String valor, int valorCarta) {
        this.valor = valor;
        this.valorCarta = valorCarta;
    }
}
