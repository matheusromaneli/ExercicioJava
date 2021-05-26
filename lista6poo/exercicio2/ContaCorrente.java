package exercicio2;

public class ContaCorrente {

    float limite,saldo,valorLimite;

    public ContaCorrente(float a,float b,float c){
        this.limite = a;
        this.saldo = b;
        this.valorLimite = c;
    }

    public void sacar(float valor){
        try {
            if(valor > this.saldo){
                throw new IllegalArgumentException("Saldo insuficiente");
            }
            else if(valor < 0){
                throw new IllegalArgumentException("Nao é possivel sacar um valor negativo");
            }
            else{
                this.saldo -= valor;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }

    public void depositar(float valor){
        try {
            if(valor < 0){
                throw new IllegalArgumentException("Nao é possivel depositar um valor negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setValorLimite(float valor){
        try {
            if(valor < 0){
                throw new IllegalArgumentException("Nao é possivel definir limite negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
