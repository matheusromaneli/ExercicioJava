import java.util.Scanner;
public class ExercicioDeSintaxe2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int R=input.nextInt();
        System.out.print("Enter an Integer: ");
        int S=input.nextInt();
        System.out.print("Enter an Integer: ");
        int T=input.nextInt();
        int valorMaximo = R;

        if(S>valorMaximo){
            valorMaximo=S;
        }
        if(T>valorMaximo){
            valorMaximo=T;
        }
        System.out.println(valorMaximo);
        input.close();
    }
    
}
