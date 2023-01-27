package UncheckedException;

import javax.swing.JOptionPane;

// Faz a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");


    try {
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
    } catch (NumberFormatException e) {
        JOptionPane.showConfirmDialog(null ,"Entrada inválida: informe um número inteiro!" + e.getMessage());
        //e.printStackTrace();
    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero (0) ");
    } finally {
        System.out.println("Chegou no finally!");
    }

    System.out.println("O código chegou até aqui");
}

    public static int dividir(int a, int b) { return a / b; }
}
