package reprodutor;

public class Musica {
  private String titulo;
  private String artista;
  private int duracao;

  // Construtores, getters e setters para os atributos da música
  // escreva construtores, getter e setter genericos para os atributos da classe
  // musica

  public String getTitulo() {
    return titulo;
  }

  public String getArtista() {
    return artista;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  public Musica(String titulo, String artista, int duracao) {
    this.titulo = titulo;
    this.artista = artista;
    this.duracao = duracao;
  }

  @Override
  public String toString() {
    return "Musica{" +
        "titulo='" + titulo + '\'' +
        ", artista='" + artista + '\'' +
        ", duracao=" + duracao +
        '}';
  }

  public void tocar() {
    System.out.println("Tocando " + this.toString());
  }

  public void pausar() {
    System.out.println("Pausando " + this.toString());
  }

  public void selecionarMusica() {
    System.out.println("Selecionando " + this.toString());
  }

}
