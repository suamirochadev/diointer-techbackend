package Loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capax de gerar a tabuada de qualquer número
 * inteiro entre 1 a 10. O usuário deve informar
 * de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo 
 * abaixo:
 * 
 * 
 * Tabuada de 5:
 * 
 *5x1 = 5
  5x2 = 10
  ...
  5x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();


        System.out.println("Tabuada de " + tabuada);


        for(int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
