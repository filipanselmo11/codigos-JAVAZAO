import java.util.*;

public class Matriz2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();
        int rows = 3;
        int cols = 3;

        // Cria as linhas primeiro
        for (int i = 0; i < rows; i++) {
            numeros.add(new ArrayList<Integer>());
        }

        // Preenche por colunas: para cada coluna, percorre as linhas
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                numeros.get(i).add(j);
            }
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Linha " + i + " " + numeros.get(i));
        }

        //Acessando Elementos
        for(int i = 0; i < numeros.size(); i++) {
            for() {}
        }

    }
}