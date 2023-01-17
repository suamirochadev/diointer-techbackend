package Loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representa o nome do aluno e o segundo representando a sua idade.
 *  (Pare inserindo o valor 0 no campo nome)
 */

public class Ex1_Nome_Idade {
    public static void main(String[] args) {

// Para ler é necessário criar um fluxo de entrada através do teclado
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


// Laço de repetição While envolverá os comandos.
        while (true) {
            System.out.println("Nome: ");
//Fará a leitura através do scanner e atribuirá a variável Nome
        nome = scan.next();

//Caso o nome for zero (0) ele para.
            if (nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
//Até aqui ele vai perguntar o nome e idade mas logo após obter as respostas será finalizado.
        }
//Para ilustrar que vai parar no nome.
        System.out.println("Continua aqui...");
        
    }

}
