package exercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            do{
                System.out.println("Insira a frase:");
                String str = input.nextLine();
                System.out.println("Insira a palavra que deseja contar a frequencia:");
                String word = input.nextLine();
            
                String[] newstr = str.split(" ");
                int cont = 0;
                for (String string : newstr) {
                    if(string.equals(word)){
                        cont++;
                    }
                }
                System.out.println("A palavra '"+word+"' apareceu "+cont+" vezes");
                System.out.println("Deseja continuar? (s/n)");        
            
            }while(input.nextLine() == "s");
            input.close();
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
