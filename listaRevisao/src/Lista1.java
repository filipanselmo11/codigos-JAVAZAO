import java.util.*;

public class Lista1 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        // ArrayList<String> lista = new ArrayList<String>();
        // ArrayList<Boolean> lista = new ArrayList<Boolean>();
        // ArrayList<Char> lista = new ArrayList<Char>();
        // ArrayList<Double> lista = new ArrayList<Double>();

        lista.add(1);
        lista.add(2);
        lista.add(900);
        lista.add(4);
        lista.add(300);
        lista.add(8901);
        
        

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        

    }
}