import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        ArrayList<Integer> listaSeis = new ArrayList<Integer>();
        Scanner x = new Scanner(System.in);

        //for(int i = 0; i < 6; i++) {
            //int numero = x.nextInt();
            //if(numero % 6 == 0) {
                //listaSeis.add(numero);
            //}
        //}

        for(int i = 0; i < 600; i++) {
            if(i % 6 == 0) {
                listaSeis.add(i);
            }
        }

        System.out.println(listaSeis);
        x.close();
    }
}