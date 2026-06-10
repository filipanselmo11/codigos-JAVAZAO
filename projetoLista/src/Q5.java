import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        ArrayList<Integer> tabuadas = new ArrayList<Integer>();
        ArrayList<Integer> multiplicadores = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            tabuadas.add(i);
        }

        for (int i = 1; i <= 10; i++) {
            multiplicadores.add(i);
        }

        for (int i = 0; i < tabuadas.size(); i++) {
            System.out.println("Tabuada do " + tabuadas.get(i));
            for (int j = 0; j < multiplicadores.size(); j++) {
                System.out.println(tabuadas.get(i) + " x " + multiplicadores.get(j) + " = " + (tabuadas.get(i) * multiplicadores.get(j)));
            }
            System.out.println();
        }
    }
}