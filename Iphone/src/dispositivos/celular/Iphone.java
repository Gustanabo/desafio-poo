package dispositivos.celular;

import dispositivos.aparelhotelefonico.AparelhoTelefonico;
import dispositivos.navegadorinternet.NavegadorInternet;
import dispositivos.reprodutormusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Iphone ligando para " + numero);
    }
    public void atender() {
        System.out.println("Iphone atendendo chamada.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Iphone exibindo pagina " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando nova aba.");
    }
    public void atualizarPagina() {
        System.out.println("Iphone atualizando pagina.");
    }

    public void tocar() {
        System.out.println("Iphone tocando musica.");
    }
    public void pausar() {
        System.out.println("Iphone pausando musica.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Iphone selecionando a musica " + musica);
    }
}
