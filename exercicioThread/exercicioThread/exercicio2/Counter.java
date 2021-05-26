
public class Counter {
    private double cont=0;

    synchronized void increment(){
        this.cont += Math.random();
    }
    synchronized void decrement(){
        this.cont -= Math.random();
    }

    public double getCont() {
        return this.cont;
    }
}
