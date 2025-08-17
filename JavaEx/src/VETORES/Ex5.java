package VETORES;

// Leia um vetor de 10 posiçoes. Contar e escrever quantos valores pares ele possui.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
    int[] val = new int[10];
    int par = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores");
        for(int i = 0; i < val.length; i++){
            System.out.print("Posição " + i + ": ");
            val[i] = scanner.nextInt();
            if (val[i] % 2 == 0) {
               par++;
            }
        }
        System.out.println("Existem " + par + " valores pares no vetor.");


    }
}
