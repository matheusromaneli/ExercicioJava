package exercicio2;

public class Teste {
    public static void main(String[] args) {
        Counter c = new Counter();
        new ThreadIncrement(c);
        new ThreadDecrement(c);
    }
}
