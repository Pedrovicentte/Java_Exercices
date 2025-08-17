package LOGICA;

//Dado os três lados de um triângulo determinar o perímetro do mesmo.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        System.out.println("Digite o valor dos lados:");
        double[] lados = new double[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < lados.length; i++){
            System.out.print("Lado "+i+": ");
            lados[i] = scanner.nextDouble();
        }
        double perimetro = lados[1] + lados[2] +lados[3];
        System.out.println("Dada a  formula P=a+b+c o perímetro do triangulo será: "+ perimetro + " cm.");
    }
}
