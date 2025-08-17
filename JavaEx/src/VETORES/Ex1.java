package VETORES;

/*
Faça um programa que possua um vetor denominado A que armazene 6 numeros inteiros.
O programa deve executar os seguintes passos:
        (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
        (b) Armazene em uma variavel inteira (simples) a soma entre os valores das posiçoes ˜
        A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
        (c) Modifique o vetor na posiçao 4, atribuindo a esta posiçao o valor 100. ˜
        (d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

public class Ex1 {
    public static void main(String[] args) {
    int[] numeros = {1, 0, 5, -2, -5, 7};
    int soma = numeros[0]+numeros[1]+numeros[5];
        System.out.println("A soma de A[0], A[1] e A[5] é: " + soma);
        System.out.println("Adicionando o número 100");
    numeros[4] = 100;
        System.out.println(numeros[4]);
      for(int i = 0; i < numeros.length; i++){
          System.out.println("Linha " + i + " : " + numeros[i]);
      }


    }
}
