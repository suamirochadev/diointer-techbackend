package metodos.metodos3;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal() {
        canal++;
        System.out.println();
    }

    public void descerCanal() {
        canal--;
    }

    public void aumentarVol() {
        // volume = volume +1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

    }

    public void diminuirVol() {
        // volume = volume -1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }
}
