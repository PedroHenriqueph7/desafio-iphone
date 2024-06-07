package iphone;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorNaInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    String numero;
    String musica;
    String url;

    public String ligar(String numero) {
        this.numero = numero;
        return numero;     
    }
    public void atender() {
        System.out.println("Atendendo");
       
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }
    public void pausar() {
        System.out.println("Pausando musica"); 
    }
    public String selecionarMusica(String musica) {
        this.musica = musica;
        return musica;
    }

    public String exibirPagina(String url) {
        this.url = url;
        return url;     
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
    
}
