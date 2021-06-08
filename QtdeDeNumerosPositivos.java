import java.util.Scanner;

public class QtdeDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contPar=0;
        double numero=0;

        for(int i = 0; i< 6; i++) {
            numero = entrada.nextDouble();

            if (numero> 0) {
                contPar++;
            }
        }

        System.out.printf(contPar + " valores positivos");
    }
}
