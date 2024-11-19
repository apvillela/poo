package org.example;

public class Pessoa {
    private int dataNascimento;
    private double peso;
    private double altura;
    private boolean sexo;
    private String nome;
    private String cpf;
    private String sobrenome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String n, String sobrenome) {
        this(n);
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String cpf, String sobrenome) {
        this(nome,sobrenome);
        this.cpf = cpf;
    }

    public void setNome(String i) {
        nome = i;
    }

    public void setCpf(String i) {
        cpf = i;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
