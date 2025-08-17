package WHILE;

import java.util.ArrayList;
import java.util.Scanner;
/*
Faça um programa, utilizando while e listas, que permita ]
o usuário escrever o nome de cinco pessoas e os mostre na tela.
*/
public class Ex3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();
    System.out.println("--------------LISTA DE NOMES--------------");
    int contador = 0;
    while(contador < 5) {
        System.out.println("Digite um nome: ");
        String nome = scan.next();
        nomes.add(nome);
        contador++;
    }
    System.out.println(nomes);
    }
}
