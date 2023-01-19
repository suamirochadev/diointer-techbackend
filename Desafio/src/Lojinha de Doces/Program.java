import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        
        System.out.format("O cliente obteve %d doces",doce*2);
    }
}