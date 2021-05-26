package poo.lista3.exercicio1;
public class CarroRevendedora {
    private String marca;
    private float preco;
    private int kmRodados;
    private boolean disponivel = true;

    public CarroRevendedora(String marca,float preco,int quilometragem){
        this.marca = marca;
        this.preco = preco;
        this.kmRodados = quilometragem;
    }

    public void vendido(){
        this.disponivel = false; 
    }

    public void editPreco(float preco){
        this.preco = preco;
    }
}
