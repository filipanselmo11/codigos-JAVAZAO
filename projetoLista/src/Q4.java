import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        Scanner x = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            int numero = x.nextInt();
            if(numero > 0) {
                numeros.add(numero);
            }
        }

        System.out.println("Lista Original: " + numeros);

        numeros.sort(null);
        System.out.println("Lista atualizada: " + numeros);

        x.close();
    }
}