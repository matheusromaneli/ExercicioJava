public class Casa {
    String color;
    Porta[] doors=new Porta[50];
    int portas=0;

    public void create(String c) {
        color=c;
    }

    public void createDoor(String c,float h,float w ){
        Porta nova=new Porta();
        nova.create(c, h, w);
        doors[portas]=nova;
        portas++;
    }

    public void openDoor(int i){
        if (i>portas){
            System.out.println("Porta nao existe");
            return;
        }
        doors[i].open();
    }
    
    public void closeDoor(int i){
        if (i>portas){
            System.out.println("Porta nao existe");
            return;
        }
        doors[i].close();
    }

    public int quantasPortasEstaoAbertas(){
        int cont=0;
        for(int i=0 ; i<portas ; i++){
            if(doors[i].estaAberta()){
                cont++;
            }
        }
        return cont;
    }

    public int quantasPortasEstaoFechadas(){
        int cont=0;
        for(int i=0 ; i<portas ; i++){
            if(doors[i].estaAberta()){
                cont++;
            }
        }
        return portas-cont;
    }
}
