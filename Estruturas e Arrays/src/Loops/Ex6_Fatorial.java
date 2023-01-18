package Loops;

import java.util.Scanner;

/*
 * Faça um programa que
 * calcule o fatorial de um numero
 * inteiro fornecido pelo usuario
 * ex: 5!= 120 (5x4x3x2x1)
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();


        int multiplicacao = 1;

        System.out.println(fatorial + "! =");
        for( int i = fatorial; i > 1 ; i-- ) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
