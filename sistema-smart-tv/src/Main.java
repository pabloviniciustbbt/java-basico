public class Main {
    
    public static void main(String[] args) {

        System.out.println("\n");

        System.out.println("TBBT SMART TV");

        System.out.println("\n");

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.informarEstado(null));

        System.out.println("\n");

        smartTv.ligar();

        System.out.println("\n");

        System.out.println(smartTv.informarEstado(null));

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("\n");

        smartTv.mudarCanal(30);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("\n");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("\n");

        System.out.println(smartTv.informarEstado(null));

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("\n");

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.println("\n");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
    
        System.out.println("\n");

        System.out.println(smartTv.informarEstado(null));

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("\n");

        smartTv.desligar();

        System.out.println("\n");

        System.out.println(smartTv.informarEstado(null));

        System.out.println("\n");

    }
    
}
