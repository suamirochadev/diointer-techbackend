package operadores.operadores6;

public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que o numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que o numero 2");

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);
    }
}
