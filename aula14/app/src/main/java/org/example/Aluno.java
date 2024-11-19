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

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", telefone=" + telefone + ", nomeDoPai=" + nomeDoPai + ", nomeDaMae=" + nomeDaMae
                + ", disciplinas=" + disciplinas + "]";
    }

}
