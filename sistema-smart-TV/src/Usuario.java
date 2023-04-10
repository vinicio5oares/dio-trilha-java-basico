public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
       
        smartTv.mudarCanal(64);

        System.out.println("TV está ligada?" + smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV está ligada? " + smartTv.ligada);

    }
}
