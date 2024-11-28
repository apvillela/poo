package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {

    private ArrayList<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas() {
        this.senhas = new ArrayList<>();
        this.contador = new AtomicInteger();

    }

    public void adicionarSenha() {
        Integer numero = contador.incrementAndGet();

    }

    public Senha chamarProxSenha() {

    }

    public static void main(String[] args) {

        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        s.adicionarSenha();
        Senha a = s.chamarProxSenha();

    }

}
