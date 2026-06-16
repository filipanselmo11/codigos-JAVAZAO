import java.util.*;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < 40; i++){
            /***
             * if(i % 2 == 0) {
             *  pares.add(i);
             * } else {
             *   impares.add(i);
             * }
             */
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }

        }

        System.out.println(pares);
        System.out.println(impares);
        
        
        entrada.close();

    }
}