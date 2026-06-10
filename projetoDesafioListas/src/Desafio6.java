import java.util.*;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> numerosUsuario = new ArrayList<Integer>();

        int quantidade = x.nextInt();
        double soma = 0;
        double media = 0;

        for(int i = 0; i < quantidade; i++) {
            int numero = x.nextInt();
            numerosUsuario.add(numero);
        }

        System.out.println(numerosUsuario);

        for (int numero : numerosUsuario) {
            soma += numero;
        }
        media = soma / quantidade;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        x.close();
    }
}