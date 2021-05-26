import java.util.*;
public class ExercicioDeSintaxe5 {

    public static int fat(int n){
        if(n==1){
            return(n);
        }
        else{
            return n*fat(n-1);
        }
    }

    public static int dofat(int n) {
        if(n<0){
            return -1;
        }
        else{
            return fat(n);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int n= input.nextInt();
        int result=dofat(n);
        if(result==-1){
            System.out.println("Nao foi possivel fazer o fatorial de "+n);
        }
        else{
            System.out.println(" Fatorial de "+n+" e: "+result);
        }
        input.close();
    }
}
