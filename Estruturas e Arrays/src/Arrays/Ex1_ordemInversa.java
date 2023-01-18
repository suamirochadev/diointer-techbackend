package Arrays;

/*
 * Crie um vetor de 6 números inteiros e mostre-os
 * na ordem inversa.
 */

public class Ex1_ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, -5, 15, 0, 8, 4};


        System.out.print("Vetor: ");
        int count=0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("Vetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
            
    }
}
