public class Exercicio3 {
    public static void main(String[] args) {
        Porta door= new Porta();
        door.create("Azul",2.4f,0.8f);
        door.open();
        System.out.println(door.estaAberta());
        door.close();
        System.out.println(door.estaAberta());
        
    }
}
