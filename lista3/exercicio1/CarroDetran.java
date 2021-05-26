package poo.lista3.exercicio1;

import java.util.Date;
public class CarroDetran {
    //ATRIBUTOS
    private String placa;
    private String donoDoCarro;
    private Date dataDoEmplacamento;
    private Date vistoria;
    private Date vencimentoDoDocumento;
    private int multas = 0;//Ideal seria um objeto multa contendo valor e tipo/gravidade da infraçao
    //CONSTRUTOR

    public CarroDetran(String placa,String donoDoCarro) {
        this.placa = placa;
        this.donoDoCarro = donoDoCarro;
        this.dataDoEmplacamento = new Date();
        this.vistoria = this.dataDoEmplacamento;
        set_vencimento();
    }
    //METODOS
    public void aplicarMulta(){
        this.multas++;
    }

    public void marcarVistoria(int year,int month,int date,int hrs,int min){

        Date temp = this.vistoria;
        this.vistoria= new Date(year, month, date, hrs, min);

        //caso marque antes da data atual
        if(this.vistoria.before(new Date())){
            this.vistoria = temp;
        }
    }

    public void mudarDono(String novoDono){
        this.donoDoCarro = novoDono;
    }

    public void passarNaVistoria(){
        set_vencimento();
    }
    //FUNCOES LOCAIS
    private void set_vencimento(){
        this.vencimentoDoDocumento = new Date( this.vistoria.getYear()+1 , this.vistoria.getMonth(), this.vistoria.getDate());
    }
}
