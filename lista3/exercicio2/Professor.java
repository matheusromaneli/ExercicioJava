package poo.lista3.exercicio2;
class Professor {

    private String nome;
    static private int professorId = 0;
    private int id = set_id();
    private Disciplina disciplina;

    public Professor(String n, Disciplina d){
        this.nome = n;
        this.disciplina = d;
    }
    
    public int get_id(){
        return this.id;
    }

    private static int set_id(){
        professorId++;
        return professorId;
    }
}
