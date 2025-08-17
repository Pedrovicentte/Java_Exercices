package VETORES;

//Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] num = new int [6];
        System.out.println("Digite 6 valores");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++){
             num[i] = scanner.nextInt();
            System.out.print("Valor " + i + ": ");
        }
        for(int tot = 0; tot < num.length; tot++){
            System.out.println("Valores digitados: "+ num[tot]);
        }

    }
}
