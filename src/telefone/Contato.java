package telefone;

public class Contato {
  private String nome;
  private String numeroTelefone;

  // Construtores, getters e setters para os atributos do contato
  // escreva construtores, getter e setter genericos para os atributos da classe
  // contato

  public String getNome() {
    return nome;
  }

  public String getNumeroTelefone() {
    return numeroTelefone;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNumeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  public Contato(String nome, String numeroTelefone) {
    this.nome = nome;
    this.numeroTelefone = numeroTelefone;
  }

  @Override
  public String toString() {
    return "Contato{" +
        "nome='" + nome + '\'' +
        ", numeroTelefone='" + numeroTelefone + '\'' +
        '}';
  }

  public void ligar() {
    System.out.println("Ligando para " + this.toString());
  }

  public void atender() {
    System.out.println("Atendendo " + this.toString());
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz para " + this.toString());
  }

}
