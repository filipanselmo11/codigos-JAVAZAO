import java.util.*;

public class Desafio5{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> listaNegativos = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            int numero = x.nextInt();
            if(numero < 0) {
                listaNegativos.add(numero);
            }
        }

        System.out.println(listaNegativos);
        x.close();
    }
}