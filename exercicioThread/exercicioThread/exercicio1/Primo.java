package exercicio1;

public class Primo extends Thread {
    
    int inicio;
    int fim;
    int cont = 0;
    public Primo(int a,int b){
        this.inicio = a;
        this.fim = b;
        start();
    }

    private boolean primo(int p){
        for (int i = 2; i < p; i++) {
            if(p%i == 0){
                return false;
            }
        }
        return true;
    }

    public void run(){
        for (int i = inicio; i <= fim; i++) {
            if(primo(i)){
                this.cont++;
                // System.out.println("Thread ("+inicio+"-"+fim+"): "+i);
            }
        }
    }

}
