import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner x = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int numero = x.nextInt();
            lista.add(numero);
        }

        System.out.println("Lista Original: " + lista);
        Collections.reverse(lista);
        System.out.println("Lista Reversa: " + lista);

    }
}