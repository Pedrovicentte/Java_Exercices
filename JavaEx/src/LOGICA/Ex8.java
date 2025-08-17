package LOGICA;

//Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
//valor de temperatura em Fahrenheit e exibi-lo em Celsius

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
    int Fahren = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em Fahrenheit:");
    Fahren = scanner.nextInt();
    int celsius = (Fahren - 32)*5/9;
        System.out.println("A temperatura de " + Fahren + " F em Celsius é " + celsius +" °C");
    }
}
