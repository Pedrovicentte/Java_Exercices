package LOGICA;

//Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        double raio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o raio da circunferência?");
        raio = scanner.nextInt();
        double perimetro = 2*3.14*raio;
        double area = 3.14 * (Math.pow(raio, 2));
        System.out.printf(" >> Para o perímetro usamos a formula C=2⋅π⋅r, portando o resultado é: "+"%.2f", perimetro);
        System.out.println("\n >> Para a área usamos a formula A=π⋅r " +
                "2, portando o resultado é: "+ area);
    }
}
