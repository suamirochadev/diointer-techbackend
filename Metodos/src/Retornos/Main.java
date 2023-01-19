package Retornos;

import Sobrecarga.Quad;

public class Main {
    public static void main(String[] args) {
        

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Retornos.Quad.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retornos.Quad.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Retornos.Quad.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
    
}
