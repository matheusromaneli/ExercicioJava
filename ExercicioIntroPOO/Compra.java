import java.util.*;
public class Compra {

    Deque<Produto> itens = new LinkedList<>();
    boolean paid = false;
    float price = 0;

    public void adicionarItem(Produto prod,int quantity){

        for(int i = 0 ; i < quantity ; i++){
            
            itens.add(prod);
        }

        price += prod.price * quantity;
    }

    public void removeItem(Produto prod){

        itens.removeLastOccurrence(prod);
        price -= prod.price;
    }

    public void pagar(int stance){

        for (Produto produto : itens) {
            produto.venda(1);
        }

        switch (stance) {

            case 1:

                //pagarCheque(price)
                break;

            case 2:

                //pagarCartao(price)
                break;
            
            case 3:

                //pagarDinheiro(price)
                break;

            default:

                System.out.println("Metodo indefinido");
                break;
        }

        paid = true;
    }
}
