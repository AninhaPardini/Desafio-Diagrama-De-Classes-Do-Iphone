import dispositivos.IPhone;
import dispositivos.Nokia3310;
import navegador.FireFox;
import navegador.Chrome;
import reprodutor.Musica;
import telefone.Contato;

import navegador.NavegadorInternet;

public class Main {
  public static void main(String[] args) {
    // Criar instâncias de dispositivos
    IPhone iphone = new IPhone();
    Nokia3310 nokia = new Nokia3310();

    // Usar os métodos dos dispositivos
    iphone.ligar();
    iphone.tocar();
    nokia.ligar();

    // Criar instâncias de navegadores
    NavegadorInternet firefox = new FireFox();
    NavegadorInternet chrome = new Chrome();

    // Usar os métodos dos navegadores
    firefox.exibirPagina("https://www.example.com");
    chrome.adicionarNovaAba();

    // Criar instâncias de músicas e contatos
    Musica musica = new Musica("Nome da Música", "Artista", 180);
    Contato contato = new Contato("Nome do Contato", "123-456-7890");

    // Usar as informações das músicas e contatos
    System.out.println("Tocando: " + musica.getTitulo() + " - " + musica.getArtista());
    System.out.println("Contato: " + contato.getNome() + " - " + contato.getNumeroTelefone());
  }
}
