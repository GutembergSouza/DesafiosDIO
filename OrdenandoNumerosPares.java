package br.com.gu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumerosPares {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int quantidadeLinhas = leitor.nextInt();

        List<Integer> numerosPares = new ArrayList();
        List<Integer> numerosImpares = new ArrayList();

        //preenche os array list com os devidos numeros pares e impares
        for(int i = 0; i<quantidadeLinhas; i++){
            int entrada = leitor.nextInt();
            if(entrada%2==0){
                numerosPares.add(entrada);
            }else{
                numerosImpares.add(entrada);
            }

        }//fim for

        //ordenando os ArrayList
        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);

        // saida dos numeros pares que ja estão em ordem
        for (int i = 0 ; i<numerosPares.size(); i++){
            System.out.println(numerosPares.get(i));
        }

        //saida decrescente dos numeros impares que estao em ordem crescente
        for (int i = numerosImpares.size()-1; i>=0 ; i--){
            System.out.println(numerosImpares.get(i));
        }

    }
}
