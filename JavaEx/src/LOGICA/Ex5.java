package LOGICA;

//Ler um número inteiro e exibir o seu sucessor.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        int num;
        System.out.println("Digite um numero inteiro:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int ant = num + 1;
        System.out.println("O sucessor de "+ num + " é " + ant +".");
    }
}

