package loja;

import java.util.Scanner;

import dispositivos.celular.Iphone;

public class Amostrador {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Demonstração do Iphone em funcionamento.");
        System.out.println("Navegador de internet:");
        iphone.adicionarNovaAba();
        System.out.print("Digite a pagina a ser exibida: ");
        String pagina = scanner.next();
        iphone.exibirPagina(pagina);
        iphone.atualizarPagina();

        System.out.println("Aparelho telefonico:");
        System.out.print("Digite o numero a ser ligado: ");
        String numero = scanner.next();
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.err.println("Reprodutor musical:");
        System.out.print("Digite a musica a ser tocada: ");
        String musica = scanner.next() + scanner.nextLine();
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        scanner.close();
    }
}
