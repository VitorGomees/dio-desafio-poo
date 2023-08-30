package iphone;
import aparelhos.AparelhoTelefonico;
import navegadores.NavegadorNaInternet;
import reprodutores.ReprodutorMusical;

public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

    public void tocar(){

        System.out.println("Tocando musica...");

    }

    public void pausar(){

        System.out.println("Pausando musica...");

    }

    public void selecionarMusica(){

        System.out.println("Selecionando musica...");

    }

    public void ligar() {

        System.out.println("Ligando para...");

    }

    public void atender() {

        System.out.println("Atendendo chamada...");

    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz...");

    }

    public void exibirPagina(){

        System.out.println("Exibindo página...");

    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }
    public void atualizarPagina(){

        System.out.println("Atualizando página...");

    }

}
