// class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!"); 
//     }
// }
import java.util.Scanner;
public class ExercicioDeSintaxe1{
    public static void main(String args[]) {
        
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an Integer: ");

        int number = input.nextInt();
        int values, cont=0;

        for(int i=0;i<number;i++){
            System.out.print("Enter an Integer: ");
            values=input.nextInt();
            if (values<0){
                cont++;
            }
        }
        
        System.out.println("Has "+cont+" negative numbers");
        input.close();
        }
}