package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private LocalDate datadeNascimento;
    private String nome;
    private String sobrenome;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;
    
    
    public Contato(LocalDate datadeNascimento, String nome, String sobrenome) {
        this.datadeNascimento = datadeNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    private boolean addTelefone(String r,String s ){
        return false;
    }
    // private boolean addEmail(String r,String e ){
    //     return false;
    // }
    


    
}
