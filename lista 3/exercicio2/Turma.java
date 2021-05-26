package poo.lista3.exercicio2;
class Turma {

    private Professor professor;
    private Inscricao[] alunos;
    private int quantidadeDeAlunos = 0;
    private String horario;

    public Turma(Professor p, String h){
        this.professor = p;
        this.horario = h;
    }
    
    public void addInscricao(Inscricao i){
        alunos[quantidadeDeAlunos] = i;
        quantidadeDeAlunos++;
    }
}
