package LOGICA;

//Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        System.out.println("Digite sua idade em dias:");
        int idade;
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();
        int anos = idade / 365;//Para saber o _ano_ basta dividir a quantidade de dias(vividos) por 365 (dias em um ano).
        int meses = (idade % 365)/30; //Para saber os _meses_ basta pegar o resto da divisão entre quantidade de dias(vividos) e dias anuais(365).
                                      // e dividir pela quantidade de dias de um mes(30).
        int dias = (idade % 365) - (meses * 30) ;// E para saber os _dias_ basta pegar o resto da divisao dos dias(vividos) pelos anuais e
                                                // a multiplicação dos meses por 30(para ficar em dias) e subtrair os dois.
        System.out.println("Você tem "+ anos + " anos, " + meses +" meses e " + dias + " dias de vida.");
    }
}
