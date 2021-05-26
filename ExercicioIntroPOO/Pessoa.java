public class Pessoa {

    String name;
    int age;

    public void create(String nome,int idade){
        name=nome;
        age=idade;
    }

    public void birthday(){
        age++;
    }

    public void imprime(){
        System.out.println("Nome: "+name+" Idade: "+age);
    }
}
