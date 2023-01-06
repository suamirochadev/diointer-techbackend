package metodos.metodos3;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVol();
        smartTv.diminuirVol();
        smartTv.diminuirVol();
        smartTv.aumentarVol();
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ->  Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->  Tv ligada ? " + smartTv.ligada);
    }
}
