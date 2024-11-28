package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(10);
        numeros.add(5);

        System.out.println(numeros);
        // Não é o recomendado para API Collections
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        // Boa alternativa
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        // A ideal usando lambda e deixa codigo menor
        numeros.forEach(e -> System.out.println(e));

        // method reference
        numeros.forEach(System.out::println);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Gabi");
        nomes.add("Leozinho Gaucho");
        nomes.add("Alexandre");

        nomes.removeIf(e -> e.equals("Gabi"));

        numeros.removeIf(e -> e == 10);

        Collections.sort(numeros);

        Collections.shuffle(nomes);

        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Ana");
        conjunto.add("Ana");


        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.add("Juca");

        // String n = fila.poll();//retorna null se fila vazia


        //o aluno deve ter um nome, pode ter 1 matricula, aluno pode ter N telefones

        //filiação, disciplinas cursando
         Aluno a = new Aluno("Ana", 12345678, "José", "Maria José");

         a.adicionarDisciplinas("POO");
         a.adicionarDisciplinas("FE1");
         a.adicionarTelefone("123");
         a.adicionarTelefone("456");
         System.out.println(a);
         
    }
}
