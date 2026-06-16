import java.util.*;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            String nome = entrada.nextLine();
            nomes.add(nome);

        }

        System.out.println("Tamanho da lista de nomes: " + nomes.size());

        entrada.close();

    }
}