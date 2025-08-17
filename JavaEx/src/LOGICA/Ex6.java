package LOGICA;

//Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
    int divi, divd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o divisor:");
        divi = scanner.nextInt();
        System.out.println("Escreva o dividendo:");
        divd = scanner.nextInt();
    int quoci = divi / divd;
    int resD = divi % divd;
        System.out.println("O quociente é " + quoci + " e o resto de divisão é "+ resD +".");
    }
}
