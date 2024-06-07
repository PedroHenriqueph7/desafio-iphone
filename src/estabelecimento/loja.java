package estabelecimento;

import iphone.Iphone;

public class loja {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funções do Iphone"); 
    
        System.out.println(iphone.ligar("Ligando para: 85-8473828"));
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        System.out.println(iphone.selecionarMusica("Selecionando musica: sol"));

        System.out.println(iphone.exibirPagina("exibindo pagina: pagina.url.com"));
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        
    }
}
