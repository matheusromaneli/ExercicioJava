package poo.lista3.exercicio1;

public class ExCarro {
    public static void main(String[] args) {
        //DETRAN
        CarroDetran detran = new CarroDetran("abc-1111","Matheus");
        detran.aplicarMulta();
        detran.marcarVistoria(2021, 3, 10, 16, 00);
        detran.mudarDono("Vania");
        detran.passarNaVistoria();

        //OFICINA
        CarroOficina mecanico = new CarroOficina("agua no motor","aaa-1234");
        mecanico.freeCarro();
    }
}
