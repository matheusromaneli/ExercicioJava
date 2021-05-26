public class Exercicio8 {
    public static void main(String[] args) {
        Bateria bat = new Bateria();
        bat.create(100);
        Celular cel = new Celular();
        cel.adicionarBateria(bat);
        cel.imprimeNivelDaBateria();
        cel.ligacao();
        cel.imprimeNivelDaBateria();
        cel.enviarTexto();
        cel.imprimeNivelDaBateria();
        bat.recarregar();
        cel.imprimeNivelDaBateria();
        
    }
}
