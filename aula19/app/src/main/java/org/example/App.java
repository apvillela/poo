package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Telefone t = new Telefone(1, "123", "gondola", .3, new Dimensao(1, 2, 3));

        Telefone sf = new SemFio(2, "456", "longa", .2, new Dimensao(1, 2, 3));

        SemFio a;

        Telefone b;

        b = sf;

        if (b instanceof SemFio) {
            ((SemFio) sf).trocarCanal();
        } else {
            System.out.println("Não é um telefone sem fio");
        }

        ArrayList<Telefone> produtos = new ArrayList<>();
        produtos.add(new Telefone(1, "123", "gondola", .3, new Dimensao(1, 2, 3)));
        produtos.add(new SemFio(2, "456", "longa", .2, new Dimensao(1, 2, 3)));

        for (Telefone tel : produtos) {
            // polimorfismo;
            if (b instanceof SemFio) {
                ((SemFio) sf).trocarCanal();
            }

            System.out.println(tel.imprimirDados());
        }

    }
}
