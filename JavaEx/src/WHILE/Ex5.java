package WHILE;

import java.util.ArrayList;
import java.util.Scanner;
/*
Faça um programa, utilizando while e listas, que permita o usuario realizar o
cadastro de um número indeterminado de pessoas enquanto quiser e os mostre
na tela ao finalizar.
*/
public class Ex5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            ArrayList<String> array = new ArrayList<>();
        String funcionarios;
        System.out.println("------CADASTRO DE FUNCIONARIOS------");
        System.out.println("Digite end para terminar o cadastro");
        while (true){
            System.out.println("Nome do Funcionário: ");
            funcionarios = scan.nextLine();
            array.add(funcionarios);
                if (funcionarios.equals("end")) {
                    break;
                }
        }
        System.out.println("Funcionários: "+ array );
    }
}
