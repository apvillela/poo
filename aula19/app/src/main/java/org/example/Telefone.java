package org.example;

class Telefone {
    private int id;
    private String numero;
    private String tipo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int id, String numero, String tipo, double peso, Dimensao dimensao) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public String imprimirDados() {
        return "Telefone{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
