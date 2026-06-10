import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        Scanner x = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int numero = x.nextInt();
            if(numero > 0) {
                lista1.add(numero);
            }
        }

        for (int numero: lista1) {
            lista2.add(numero);
        }

        System.out.println(lista1);
        System.out.println(lista2);
        

        x.close();


    }
}