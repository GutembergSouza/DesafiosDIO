import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int distanciaPercorrida = leitor.nextInt();
        double combustivelGasto = leitor.nextDouble();

        double media = distanciaPercorrida / combustivelGasto ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media));
    }
}
