package VETORES;

//Faça um programa que receba do usuario um vetor com 10 posiçoes. Em seguida deverá
//ser impresso o maior e o menor elemento do vetor.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        double[] numeros = new double[11];
        double valorMax = numeros[0]; // Começa lendo o primeiro valor do vetor
        double valorMin = numeros[0];
        System.out.println("-----| Digite 10 numeros |-----");
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < numeros.length; i++){ // A variavel i começa lendo o segundo numero do vetor
            System.out.print("Posição "+ i + ": ");
            numeros[i] = scanner.nextInt();
            if(numeros[i] > valorMax ) //Faz a verificação pra ver se o primero valor e maior que os demais numeros do vetor.
                valorMax = numeros[i];      //Se não for maior a variavel valorMax recebe o maior numero do vator.
            if(numeros[i] < valorMin){ //Faz a verificação pra ver se o primero valor e menor que os demais numeros do vetor.
                valorMin = numeros[i]; //
            }
        }
        System.out.println("---> O maior valor é: " + valorMax);
        System.out.println("---> O menor valor é: " + valorMin);
     }
}
