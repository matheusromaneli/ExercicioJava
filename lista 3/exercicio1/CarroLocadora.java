package poo.lista3.exercicio1;
import java.util.Date;
public class CarroLocadora {

    //Atributos
    private boolean alugado = false;
    private String placa;
    private float valorAluguel;
    private Date retirada;
    //CPF de quem alugou
    private String alugadoPor;
    //Construtor
    public CarroLocadora(String placa,float valorAluguel){
        this.placa = placa;
        this.valorAluguel = valorAluguel;
    }

    //Metodos
    public boolean getCar(String CPF){
        if(!this.alugado){
            this.alugadoPor = CPF;
            this.alugado = true;
            this.retirada = new Date();
            return true;
        }
        return false;
    }

    public float getCarBack(){
        if(this.alugado){
            this.alugadoPor = "";
            this.alugado = false;
            Date today = new Date();
            long totalDays = (today.getTime() - this.retirada.getTime())/8640000;
            if(totalDays < 1){
                return this.valorAluguel;
            }
            return totalDays * this.valorAluguel;
        }
        return 0;
    }
}
