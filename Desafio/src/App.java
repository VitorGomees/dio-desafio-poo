import aparelhos.AparelhoTelefonico;
import aparelhos.IPhone13;
import aparelhos.IPhone14;
import navegadores.GoogleChrome;
import navegadores.NavegadorNaInternet;
import navegadores.NavegadorNativo;
import reprodutores.AppleMusic;
import reprodutores.ITunes;
import reprodutores.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {

        //Testando
        ReprodutorMusical reprodutor1 = new AppleMusic();
        ReprodutorMusical reprodutor2 = new ITunes();
        AparelhoTelefonico aparelho1 = new IPhone13();
        AparelhoTelefonico aparelho2 = new IPhone14();
        NavegadorNaInternet navegador1 = new GoogleChrome();
        NavegadorNaInternet navegador2 = new NavegadorNativo();

        reprodutor1.selecionarMusica();
        reprodutor2.pausar();
        aparelho1.atender();
        aparelho2.iniciarCorreioVoz();
        navegador1.adicionarNovaAba();
        navegador2.atualizarPagina();
        
    }
}
