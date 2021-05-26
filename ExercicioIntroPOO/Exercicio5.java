public class Exercicio5 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.imprime();
        tv.ligaDesliga();
        tv.abaixaVolume();
        tv.aumentaVolume();
        tv.canalProximo();
        tv.canalEspecifico(57);
        tv.canalAnterior();
        tv.imprime();
        tv.canalAnterior();
        tv.silence();
        tv.imprime();

        for (int i = 0; i < 20; i++) {

            tv.aumentaVolume();
        }

        tv.silence();
        tv.canalEspecifico(156);
        tv.ligaDesliga();
        tv.imprime();

    }
}
