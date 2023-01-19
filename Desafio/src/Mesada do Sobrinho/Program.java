import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        final int mesada = 50;
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        System.out.println(entrada*mesada);
    }
}