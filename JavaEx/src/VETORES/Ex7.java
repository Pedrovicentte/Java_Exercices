package VETORES;
/*
 Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima
o vetor, o maior elemento e a posição que ele se encontra.
*/
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
       int[] valor = new int[11];
       int maiorV = valor[0];
       int posi = 0;
        System.out.println("--| Digite 10 valores |--");
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < valor.length; i++){
            System.out.print("Valor "+i+" : ");
            valor[i] = scanner.nextInt();
            if(maiorV < valor[i]){
                maiorV = valor[i];
            }
            if(valor[i] == maiorV){
                posi = i;
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i = 1; i < valor.length; i++){
            System.out.print("Posição "+i+" :");
            System.out.println(valor[i]);
        }

        System.out.println("--> Maior valor: "+ maiorV);
        System.out.println("--> Posição: " + posi);
    }
}
