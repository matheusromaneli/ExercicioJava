public class Televisao {

    static boolean status = false;
    static int volume = 0;
    static int channel = 0;
    static boolean silence = false;
    static int previousChannel=0;

    public void ligaDesliga() {

        status = !status;
    }

    public void canalEspecifico(int n){

        previousChannel = channel;
        channel = n;
        channel = channel % 100;
    }

    public void canalProximo(){

        previousChannel= channel;
        channel++;
        channel=channel%100;
    }

    public void canalAnterior(){

        int aux=previousChannel;
        previousChannel=channel;
        channel=aux;
    }

    public void silence() {

        silence = !silence;
    }

    public void aumentaVolume(){
        
        if (volume++ >= 10){
            
            volume--;
        }
    }

    public void abaixaVolume(){

        if (volume-- <= 0){
            
            volume++;
        }
    }

    public void imprime(){

        System.out.println("Ligada? "+status);
        System.out.println("Canal: "+channel);
        System.out.println("Volume: "+volume);
        System.out.println("Silenciada: "+silence);
        System.out.println();
    }
}
