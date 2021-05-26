public class Exercicio4 {
    public static void main(String[] args) {
        Casa home=new Casa();
        home.create("Cinza");
        home.createDoor("Azul", 2.4f, 0.8f);
        home.createDoor("Amarelo", 2.0f, 0.7f);
        home.openDoor(0);
        System.out.println(home.quantasPortasEstaoAbertas());
    }
}
