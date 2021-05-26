import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
public class Celular {

    Bateria bateria;
    
    public void adicionarBateria(Bateria bat) {

        bateria = bat;
    }

    public void enviarTexto(){

        bateria.atualCharge--;
    }

    public void ligacao(){
        
        Calendar c = Calendar.getInstance();
        Date juDate = c.getTime();
        long before = juDate.getTime();

        //finish the call
        System.out.print("Digite algum numero para finalizar a ligacao: ");
        Scanner stop = new Scanner(System.in);
        stop.nextInt();
        stop.close();
        
        c = Calendar.getInstance();
        juDate = c.getTime();
        long after = juDate.getTime();

        long time = after - before;
        time= time/1000;
        bateria.atualCharge -= time * 5;
    }

    public void imprimeNivelDaBateria(){
        System.out.println("Nivel da bateria e:"+bateria.atualCharge+"/"+bateria.capacity);
    }
}
