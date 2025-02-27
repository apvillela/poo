package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int lerMensagem(String mensagem) throws //throws joga a responsa de tratar o
            InputMismatchException {                      //erro pro metodo q o invoca
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensagem);
        int numero = teclado.nextInt();
        return numero;
    }
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];

        try {
            int numero = lerMensagem("Digite um numero: ");

            int posicao = lerMensagem("Digite uma posicao: ");
            vetor[posicao] = numero;
        }catch(InputMismatchException e) {
            System.err.println("Apenas numeros " + e);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Apenas numeros de 0 a 9" + e);
        }catch(Exception e) {
            System.err.println("Ocorreu um erro " + e);
        }


    }
}
