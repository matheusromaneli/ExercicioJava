package poo.lista3.exercicio2;
class Inscricao {

    //ATRIBUTOS
    private int Aluno_id;
    private float[] notas;
    private int i=0;
    private String status = "Cursando";
    private float media =0;
    
    //CONSTRUTOR
    public Inscricao(int a){
        this.Aluno_id = a;
    }

    //METODOS
    public void add_nota(float valor){
        if(this.status == "Cursando"){
            notas[i] = valor;
            i++;
        }
    }

    public void fecharInscricao(){
        if(this.status == "Cursando"){
            float notaFinal = 0;
            for (float f : notas) {
                notaFinal += f;
            }
            this.media = notaFinal/i;
            if(media >= 6) this.status = "Aprovado";
            else this.status = "Reprovado";
        }
    }

    public float getMedia(){
        return this.media;
    }

    public String getStatus(){
        return this.status;
    }
}
