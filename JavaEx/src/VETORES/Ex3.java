package VETORES;

/*
Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos temˆ
10 elementos cada. Imprimir todos os conjuntos.

* */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        float[] num = new float[10];
        float[] res = new float[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){ //Acessa o valor do vetor num na posição i.
            num[i] = scanner.nextInt();
            float raQ =  (float) Math.sqrt(num[i]); // Porque Math.sqrt() retorna double, mas a variável era float. Então precisamos forçar a conversão para (float).
            res[i] = raQ;
            //O i é a variável do for que representa a posição atual do vetor

         }
        for(int i = 0; i < num.length; i++){
            System.out.println("Valores " +i+ " :"+ num[i] + " |"+ " Raiz Quadrada: " + res[i]);

        }
    }
}
