package poo.lista3.exercicio1;
import java.util.Date;

public class CarroOficina {
    private boolean problemSolved = false;
    private String problem;
    private String placa;
    private Date entryDate = new Date();
    private Date solveDate;

    public CarroOficina(String prob,String placa){
        this.problem = prob;
        this.placa = placa;
    }

    public void freeCarro(){
        this.problemSolved = true;
        this.solveDate = new Date();
    }

    public void editProblem(String prob){
        this.problem = prob;
    }
}
