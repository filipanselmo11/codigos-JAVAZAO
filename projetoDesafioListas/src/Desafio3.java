import java.util.*;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        ArrayList<String> nomePessoas = new ArrayList<String>();

        for(int i = 0; i < 15; i++) {
            String nome = x.nextLine();
            nomePessoas.add(nome);
        }

        System.out.println(nomePessoas);

        x.close();
    }
}