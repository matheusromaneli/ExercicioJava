public class ExercicioDeSintaxe6 {
    // public static int fibonacci(int n) {
    //     if(n==1){
    //         return 0;
    //     }
    //     else if(n==2){
    //         return 1;
    //     }
    //     else{
    //         return fibonacci(n-1)+fibonacci(n-2);
    //     }
    //}
    public static long fibonacci(int n) {
        long a=0L,b=1L,c=1L;
        for (int i = 0; i < n; i++) {
            a=b;
            b=c;
            c=a+b;
        }
        return a;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fibonacci(i));
        }

    }
}
