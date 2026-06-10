import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        ArrayList<Float> vetorDecimais = new ArrayList<Float>();
        Scanner x = new Scanner(System.in);

        double maior = 0; 
        double menor = 0;

        for(int i = 0; i < 5; i++) {
            float numero = x.nextFloat();
            vetorDecimais.add(numero);
        }

        System.out.println(vetorDecimais);

        for (double numero: vetorDecimais) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor || menor == 0) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        x.close();

    }
}