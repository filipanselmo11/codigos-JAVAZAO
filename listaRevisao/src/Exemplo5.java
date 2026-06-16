import java.util.*;

public class Exemplo5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> um = new ArrayList<Integer>();
        ArrayList<Integer> dois = new ArrayList<Integer>();
        ArrayList<Integer> tres = new ArrayList<Integer>();

        int quantidadeElementos = entrada.nextInt();

        for (int i = 0; i < quantidadeElementos; i++) {
            int numero = entrada.nextInt();
            switch(numero) {
                case 1:
                    um.add(numero);
                    break;
                case 2:
                    dois.add(numero);
                    break;
                case 3:
                    tres.add(numero);
                    break;
                default:
                    break;
            }
        }

        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
        
        
        entrada.close();

    }
}