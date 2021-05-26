package poo.lista3.exercicio2;
class Aluno {

    //ATRIBUTOS
    static private int studentId = 0;
    private int id = set_id();
    private Inscricao[] materias;
    private int contadorInscricao = 0;

    //METODOS
    public int get_id(){
        return this.id;
    }
    
    public void inscreve(Turma t){
        materias[contadorInscricao] = new Inscricao(this.id);
        t.addInscricao(materias[contadorInscricao]);
        contadorInscricao++;
    }
    
    public float calculoCR(){
        float cr = 0;
        int cont = 0;
        for (Inscricao inscricao : materias) {
            if(inscricao.getStatus()!= "Cursando"){
                cr += inscricao.getMedia();
                cont++;
            }
        }
        return cr/cont;
    }
    //PRIVATE
    private static int set_id(){
        studentId++;
        return studentId;
    }
}
