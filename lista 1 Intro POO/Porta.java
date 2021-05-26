public class Porta {

    String color;
    Boolean status= false;
    float height;
    float width;

    public void create(String c,float h,float w){
        color=c;
        height=h;
        width=w;
        
    }
    
    public void open(){
        status = true;
    }

    public void close(){
        status = false;
    }

    public boolean estaAberta(){
        if (status) {
            return true;
        }
        return false;
    }

}
