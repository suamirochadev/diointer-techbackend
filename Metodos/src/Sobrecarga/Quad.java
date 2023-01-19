package Sobrecarga;

public class Quad {
    public static void area(double lado) {
        System.out.println("Área de quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}
