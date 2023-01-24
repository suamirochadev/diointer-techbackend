package Heranca.Interfac;

public class Calculadora implements OperacaoMatematica{
    @Override
    public void soma(double operador1, double operador2) {
        System.out.println("Soma: " + operador1 + operador2);
    }

    @Override
    public void subtracao(double operador1, double operador2) {
        System.out.println("Subtracao: " + operador1 + operador2);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void multiplicacao(double operador1, double operador2) {
        System.out.println("Multiplicacao: " + operador1 + operador2);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void divisao(double operador1, double operador2) {
        System.out.println("Divisao: " + operador1 + operador2);
        // TODO Auto-generated method stub
        
    }    
}
