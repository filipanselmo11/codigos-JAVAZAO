import java.util.*;

public class Exemplo3 {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<String>();

        // cidades.add("São Gabriel da Cachoeira");
        // cidades.add("Manaós");
        // cidades.add("SIRN");
        // cidades.add("Barcelos");
        // cidades.add("Parintins");
        // cidades.add("Rio de Janeiro");
        // System.out.println(cidades);
        
        for(int i = 0; i < 5; i++) {
            String nomeCidade = x.nextLine();
            cidades.add(nomeCidade);
        }

        System.out.println(cidades);


        x.close();
    }
}