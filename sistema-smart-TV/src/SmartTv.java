public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume =25;


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    public void aumentarVolume(){
        System.out.println("Aumentando volume para:" + volume);
        volume++;
    }

    public void diminuirVolume(){

        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }

    public void aumentarDeCanal(){
        canal++;

    }


    public void diminuirCanal(){

        canal--;

    }


    public void mudarCanal(int novoCanal){

        canal = novoCanal;
    }
}
