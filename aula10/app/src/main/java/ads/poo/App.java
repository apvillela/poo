package ads.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        contador1.definirValor(1);
        contador1.getValorAtual();
        System.out.println(contador1.getFormatValorAtual());

        Carro fusca = new Carro();

        fusca.definirVelocidade(10);
        fusca.definirCor("azul ");
        fusca.definirModelo("Fusca ");
        System.out.println(fusca.obterModelo() + fusca.obterCor() + "está " + fusca.obterVelocidade() + "km/h");

        Carro gol = new Carro();
        gol.definirVelocidade(30);
        gol.definirCor("verde ");
        gol.definirModelo("Gol ");
        System.out.println(gol.obterModelo() + gol.obterCor() + "está " + gol.obterVelocidade() + "km/h");

        Caneta canetaAzul = new Caneta();

        canetaAzul.setCor("azul");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Quanto você quer desenhar? (Digite 0 para sair)");
            int desenho = scan.nextInt();
            scan.nextLine();
            if (desenho == 0) {
                System.out.println("Saindo...");
                break;
            }
            System.out.println(canetaAzul.desenhar(desenho));

        }
        scan.close();
    }
}
