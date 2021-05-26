public class Agenda {

    Contato[] contatos= new Contato[100];
    int cont=0;

    public void addNew(String nome, String telefone){
        Contato fulano=new Contato();
        fulano.name=nome;
        fulano.telephone=telefone;
        contatos[cont]=fulano;
        cont++;
    }

    public void imprime(){

        for(int i=0;i<cont;i++){
            System.out.println("Nome: "+contatos[i].name +" Telefone: "+ contatos[i].telephone );
        }

    }
}
