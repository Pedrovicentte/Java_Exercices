package LOGICA;

//Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
//perímetro.

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] lados = new int[4];
        int base, alt;
        System.out.println("--|Infome primeiro a Base e Altura:|--");
        System.out.print("Base: ");
        base = scan.nextInt();
        System.out.print("Altura: ");
        alt = scan.nextInt();
        int area = (base * alt) / 2;
        System.out.println("--|Agora informe os valores dos lados|--");
        for(int i = 1; i < lados.length; i++){
            System.out.print("Lado "+ i +": ");
            lados[i] = scan.nextInt();
        }
        int perimetro = lados[0] + lados[1] + lados[2];
        System.out.println("--> Area: " + area);
        System.out.println("--> Perimetro: " + perimetro);
    }
}
