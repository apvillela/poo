package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {

    private String nome;
    private int matricula;
    private ArrayList<String> telefone;
    private String nomeDoPai;
    private String nomeDaMae;
    private HashSet<String> disciplinas;

    
    public Aluno(String nome, int matricula, String nomeDoPai, String nomeDaMae) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.disciplinas = new HashSet<>();
        this.telefone = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public HashSet<String> getDisciplinas() {
        return disciplinas;
    }
    
    public boolean adicionarDisciplinas(String d){
        return this.disciplinas.add(d);
        
    }
    public boolean adicionarTelefone(String d){
        return this.telefone.add(d);
        
    }
    

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Matricula: " + matricula);
        sb.append("\nNome:      " + nome);
        sb.append("\nFiliação:  " );
        sb.append("\n      pai: "+ nomeDoPai);
        sb.append("\n      mãe: "+ nomeDaMae);
        sb.append("\nTelefones: ");
        for (String element : telefone) {
            sb.append("\n\t-"+ element);
        };
        sb.append("\nDisciplinas: ");
        for (String string : disciplinas) {
            sb.append("\n\t-"+ string);
        }
        String stringFinal = sb.toString();
        return stringFinal;
    }
    
}
