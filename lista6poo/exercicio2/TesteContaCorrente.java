package exercicio2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente banco= new ContaCorrente(50,50,50);
        banco.sacar(-30);
        banco.sacar(60);
        banco.depositar(-3);
        banco.setValorLimite(-4);
    }
}
