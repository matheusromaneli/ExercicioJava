public class Produto {

    float price;
    int amount;

    public void cadastro(float p, int a){

        price=p;
        amount=a;
    }

    public void venda(int n){

        amount -= n;
    }

    public void adicionarEstoque(int quantidade){

        amount+= quantidade;
    }
}
