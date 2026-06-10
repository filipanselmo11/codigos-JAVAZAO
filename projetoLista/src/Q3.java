import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>();

        for(int i = 1; i <= 4; i++) {
            lista1.add(i);
        }

        for (int j = 5; j <= 12; j++) {
            lista2.add(j);
        }

        for(int elemento1: lista1) {
            lista3.add(elemento1);
        }

        for(int elemento2: lista2) {
            lista3.add(elemento2);
        }

        //lista3 = lista1 + lista2
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
        
    }
}