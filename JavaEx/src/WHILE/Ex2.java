package WHILE;

import java.util.Scanner;
/*
Faça um programa, utilizando while, que mostre na tela
de 0 até N, em que N é o limite inserido pelo usuário.
*/
public class Ex2 {
    public static void main(String[] args) {
        int limite;
        Scanner scan = new Scanner(System.in);
        System.out.println("Até quanto quer contar?");
        limite = scan.nextInt();
        int contador = 0;
        while(contador < limite ){;
            contador++;
            System.out.println(contador);
        }
    }


}
