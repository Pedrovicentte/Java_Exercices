package VETORES;

/*
    Faça um programa que leia um vetor de 8 posiçoes e, em seguida, leia também dois va- ´
    lores X e Y quaisquer correspondentes a duas posiçoes no vetor. Ao final seu programa ˜
    devera escrever a soma dos valores encontrados nas respectivas posiçoes ˜ X e Y .
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
    double[] nrms = new double[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("--|DIGITE SEIS VALORES|--");
      for(int i = 0; i < nrms.length; i++){
          System.out.print("Posição " + i + ": ");
          nrms[i] = scanner.nextDouble();
        }
        System.out.println("=-=|Agora digite a posição de dois valores (0 a 7)|=-=");
        int posi1 = scanner.nextInt();
        int posi2 = scanner.nextInt();
        System.out.println("A soma dos dois numeros é: ");
        double soma = nrms[posi1] + nrms[posi2]; //Pega os valores nas suas respctivas posições.
        System.out.println(soma);


    }
}
