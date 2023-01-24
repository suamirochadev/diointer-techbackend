package Estrutura;

public class Ex3_Carro {
    String cor;
    String modelo;
    double capacidadeTanque;

//sobrecarga
 //objeto vazio
    public Ex3_Carro() {

    }
//objeto com valores
    public Ex3_Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }
//constructor aqui
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    String getModelo() {
        return modelo;
    }

    //get e set tanque

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return (int) capacidadeTanque;
    }

    //método do total para encher o tanque 

    public double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
