import java.util.*;

public class Desafio4{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> listaPositivos = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            int numero = x.nextInt();
            if(numero > 0) {
                listaPositivos.add(numero);
            }
        }

        System.out.println(listaPositivos);
        x.close();
    }
}