public class Bateria {
    int capacity;
    int atualCharge;

    public void create(int unity){
        
        capacity = unity;
        atualCharge = unity;
    }

    public void recarregar(){

        atualCharge = capacity;
    }
}
