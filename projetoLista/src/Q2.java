import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        
        Scanner x = new Scanner(System.in);

        //int quantidade = x.nextInt();

        for (int i = 0; i < 5; i++) {
            int numero = x.nextInt();
            if (numero > 0) {
                lista1.add(numero);
            }
        }

        for (int j = 0; j < 5; j++) {
            int numero2 = x.nextInt();
            if (numero2 > 0) {
                lista2.add(numero2);
            }
        }

        for(int z = 0; z < 5; z++) {
            lista3.add(lista1.get(z) + lista2.get(z));
        }
        
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);

        //System.out.println(lista1.size());
        //System.out.println(lista2.size());
        //System.out.println(lista3.size());
        

        x.close();
    }
}