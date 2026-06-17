import java.util.*;

public class Matriz1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 2; i++) {
            numeros.add(new ArrayList<Integer>());
            for(int j = 0; j < 2; j++) {
                numeros.get(i).add(j);
            }
        }

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println("Linha " + i + " " + numeros.get(i));
        }

        //Acessando elementos da matriz
        for(int i = 0; i < numeros.size(); i++) {
            for(int j = 0; j < numeros.get(i).size(); j++) {
                System.out.println(numeros.get(i).get(j));
            }
        }

    }
}