
import java.util.*;
public class ExercicioDeSintaxe7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float note=0,cont=0,pessimas=0,ruins=0,boas=0,otimas=0;

        do{
            System.out.print("Insira uma nota entre 0-100: ");
            note = input.nextInt();
            if(note<=100 && note>=75){
                otimas++;
                cont++;
            }
            else if(note<75 && note>=50){
                boas++;
                cont++;
            }
            else if(note<50 && note>=25){
                ruins++;
                cont++;
            }
            else if(note<25 && note>=0){
                pessimas++;
                cont++;
            }
        }while(note>-1 && note<101);
        input.close();

        String output= String.format("Otimas: %.2f",otimas/cont*100);
        System.out.println(output+"%");

        output= String.format("Boas: %.2f",(boas/cont)*100);
        System.out.println(output+"%");

        output= String.format("Ruins: %.2f",ruins/cont*100);
        System.out.println(output+"%");

        output= String.format("Pessimas: %.2f",pessimas/cont*100);
        System.out.println(output+"%");

    }
}
