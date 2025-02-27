
package ads.poo;

public class App {

    public static void main(String[] args) {
        //criando uma conta e fazendo um saque
//        Conta c1 = new Conta(200);
//        try{
//            c1.saque(300);
//        } catch (SaldoInsuficienteException e) {
//            System.out.println(e.getMessage());
//        }

        Pilha p1 = new Pilha(4);
        try {
            p1.empilharPessoa(new Pessoa("Fulano", "cpfReal"));//criando a pessoa ja dentro do metodo
            p1.desempilharPessoa();
            p1.empilharPessoa(new Pessoa("leo","123hahaha"));
            p1.empilharPessoa(new Pessoa("leo","123hahaha"));

            p1.desempilharPessoa();
            p1.desempilharPessoa();
        } catch (PilhaCheiaException | PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }


    }
}
