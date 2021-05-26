package exercicio1;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        Primo thread1 = new Primo(2,num/2);
        Primo thread2 = new Primo(num/2+1,num);
        // thread.start();
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        int quant = thread1.cont+thread2.cont;
        System.out.println("entre 0-"+num+" possui "+quant+" primo(s)");
        input.close();
    }
}
