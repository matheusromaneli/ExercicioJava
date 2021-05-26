package exercicio2;

public class ThreadIncrement implements Runnable{
    public String name = "increment";
    private static Counter c;

    public ThreadIncrement(Counter counter){
        c = counter;
        new Thread(this).start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(c.getCont()<3){

                c.increment();
            }
            System.out.println("Valor atual de cont é: " + c.getCont());
            try {
                int a = (int)(Math.random()*500);
                System.out.println(this.name +" sleep "+a);
                Thread.sleep(a);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
