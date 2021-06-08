import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int  totalPar = 0;
        int  totalImpar= 0;
        int  totalPositivo= 0;
        int  totalNegativo= 0;
        int  valor;

//continue a solução
        for (int i =0; i<5; i++) {
            valor = leitor.nextInt();

            if(valor>0){ totalPositivo++; }

            if(valor<0){ totalNegativo++; }

            if(valor%2 == 0){
                totalPar++;
            }else{
                totalImpar++;
            }

        }
//insira suas variaveis corretamente
        System.out.println(totalPar + " valor(es) par(es)");
        System.out.println(totalImpar + " valor(es) impar(es)");
        System.out.println(totalPositivo + " valor(es) positivo(s)");
        System.out.println(totalNegativo + " valor(es) negativo(s)");
    }
}
