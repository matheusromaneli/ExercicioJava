package poo.lista3.exercicio4;
class Data {
    private int dia;
    private int mes;
    private int ano;

    private String[] meses= {"Janeiro","Fevereiro","Marco","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    private int[] dias= {0,21,59,90,120,151,181,212,243,273,304,334,365};

    //CONSTRUTORES
    public Data(int d, int m, int a){//dd/mm/aaaa
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public Data(String m, int d, int a){//March 6, 2021
        this.dia = d;
        this.mes = setMes(m);
        this.ano = a;
    }

    public Data(int d, int a){//DDD/AAAA
        calculatedayAndMonth(d);
        this.ano = a;
    }
    //METODOS
    public void printAll(){
        printa(this);
        printb(this);
        printc(this);
        System.out.println();
    }
    public void printa(Data d){
        System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
    }
    public void printb(Data d){
        System.out.println(meses[d.getMonth()-1]+" "+d.getDay()+", "+d.getYear());
    }
    public void printc(Data d){
        int diasTotais= d.getDay();
        diasTotais += dias[d.getMonth()-1];
        System.out.println(diasTotais+"/"+d.getYear());
    }

    public int getDay(){
        return this.dia;
    }
    public int getMonth(){
        return this.mes;
    }
    public int getYear(){
        return this.ano;
    }
    
    //PRIVADO
    private int setMes(String s){
        for (int i = 0; i < meses.length; i++) {
            if(s == meses[i]) return i+1;
        }
        return 0;
    }

    private void calculatedayAndMonth(int d){
        int cont=0;
        for (int i = 0; d>dias[i] ; i++) cont =i;
        setDayAndMonth(d-dias[cont], cont+1);
    }
    
    private void setDayAndMonth(int d, int m){
    
        this.dia = d;
        this.mes = m;
    }
}

