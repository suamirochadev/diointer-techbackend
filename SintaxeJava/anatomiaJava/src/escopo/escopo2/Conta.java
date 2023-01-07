package escopo.escopo2;

public class Conta {
    // variavel da classe conta chamado saldo
    double saldo = 10.0;

    public void sacar(Double valor) {
        // variavel local de método (sacar)
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        System.out.println(novo saldo);
        }

    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começandoa variável
        for (int x=1; x<=5; x++) {//x variável de escopo de 
        //esta variavel será reiniciada a cada
        double valorCalculado = valorParcela * x;
        valorMontante = valorMontante + valorCalculado
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponiveis
        
        return valorMontante;
        }
}
