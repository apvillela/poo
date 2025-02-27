package org.example;

public class SemFio extends Telefone {
    public SemFio(int id, String numero, String tipo, double peso, Dimensao dimensao) {
        super(id, numero, tipo, peso, dimensao);

    }

    public void trocarCanal() {
        System.out.println("Canal trocado");
    }
}
