package LOGICA;

//Converter um inteiro informado menor que 32 para sua representação em binário

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ser transformado em binário até 32");
        int valor = scanner.nextInt();
        if(valor >= 0 && valor < 32){
            String binario = Integer.toBinaryString(valor); //Converto um valor Int em string para usar
            System.out.println(binario);                    // o método toBinaryString.
        }
        else{
            System.out.println("Valor inválido");
        }
    }
}
