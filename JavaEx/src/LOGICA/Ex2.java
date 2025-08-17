package LOGICA;

//Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor dos lados:");
        int lados;
        lados = scanner.nextInt();
        int perim = 4 * lados;
        double  area =  Math.pow(lados, 2);
        System.out.println("O perimetro do quadrado é: " + perim);
        System.out.println("A area do quadrado é: " + area);
    }
}
