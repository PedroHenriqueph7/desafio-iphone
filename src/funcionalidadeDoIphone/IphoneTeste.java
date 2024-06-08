package funcionalidadeDoIphone;

import java.util.Scanner;

import iphone.Iphone;

public class IphoneTeste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Iphone iphone = new Iphone();
        String numero;
        String musica;
        String url;

        System.out.println("Informe o número para a ligação: "); 
        numero = scanner.nextLine();
        iphone.ligar(numero); 
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        System.out.println("Selecione a musica: ");
        musica = scanner.nextLine();
        iphone.selecionarMusica(musica);

        System.out.println("Informe o url da página: ");
        url = scanner.nextLine();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

     scanner.close();   
    }
}
