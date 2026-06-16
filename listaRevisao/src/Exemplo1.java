import java.util.*;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numerosCinco = new ArrayList<Integer>();

        for(int i = 0; i < 6; i++) {
            int numero = entrada.nextInt();
            if(numero % 5 == 0) {
                numerosCinco.add(numero);
            }
        }

        System.out.println(numerosCinco);

        entrada.close();

    }
}