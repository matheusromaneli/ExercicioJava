import java.util.*;
public class ExercicioDeSintaxe8 {

    public static boolean lines(int[][] matriz, int sum){
        for(int i=0;i<matriz.length;i++){
            int soma=0;
            for (int j = 0; j < matriz.length; j++) {
                soma+= matriz[i][j];
            }
            if (soma!=sum){
                return false;
            }
        }
        return true;
    }

    public static boolean columns(int[][] matriz, int sum){
        for(int i=0;i<matriz.length;i++){
            int soma=0;
            for (int j = 0; j < matriz.length; j++) {
                soma+= matriz[j][i];
            }
            if (soma!=sum){
                return false;
            }
        }
        return true;
    }

    public static boolean diagonal(int[][] matriz, int sum){
        int somaPrincipal=0;
        int somaSecundaria=0;
        for (int i = 0; i < matriz.length; i++) {
            somaPrincipal+= matriz[i][i];
            int j= matriz.length-i-1;
            somaSecundaria+= matriz[j][j];
        }
        if (somaPrincipal==sum && somaSecundaria==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean magico(int[][] matriz, int sum){
        if(lines(matriz,sum)&&columns(matriz,sum)&& diagonal(matriz,sum)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Insira o tamanho do quadrado magico: ");
        int n = input.nextInt();
        int[][] cuboMagico=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                System.out.print("Valor da posicao ["+i+"]["+j+"]: ");
                cuboMagico[i][j]=input.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < cuboMagico.length; i++) {
            sum+= cuboMagico[0][i];
        }
        if(magico(cuboMagico,sum)){
            System.out.println("E magico");
        }
        else{
            System.out.println("Nao e magico");
        }
        input.close();
    }
}
