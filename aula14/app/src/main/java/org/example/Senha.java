package org.example;

import java.time.LocalDateTime;

public class Senha {

    private Integer numero;
    private boolean preferencial;
    private String assunto;
    private LocalDateTime horario;
    
    public Senha(Integer numero, boolean preferencial, String assunto, LocalDateTime horario) {
        this.numero = numero;
        this.preferencial = preferencial;
        this.assunto = assunto;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Senha [numero=" + numero + ", preferencial=" + preferencial + ", assunto=" + assunto + ", horario="
                + horario + "]";
    }

    
    
}
