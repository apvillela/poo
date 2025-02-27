package ads.poo;

public class Pilha {

    private Pessoa[] pessoas;
    private int total = 0;



    public Pilha(int tamanho)  {
        this.pessoas = new Pessoa[tamanho];

    }

    boolean isPilhaCheia(){
        return total == pessoas.length;
    }
    boolean isPilhaVazia(){

        return total == 0;
    }

    void empilharPessoa(Pessoa pessoa)throws PilhaCheiaException{
        if (isPilhaCheia()){
            throw new PilhaCheiaException("Pilha cheia");
        }
        pessoas[total++] = pessoa;
    }
    Pessoa desempilharPessoa()throws PilhaVaziaException{
        if(isPilhaVazia()){
            throw new PilhaVaziaException("Pilha vazia");
        }
        return pessoas[--total];
   }




}
