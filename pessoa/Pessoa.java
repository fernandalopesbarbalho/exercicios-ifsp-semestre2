class Pessoa {
  //atributos
  private String nome;
  private int idade;

  //métodos
  public void dizerNome() {
    System.out.println("\nNome: " + nome);
  }

  public void dizerIdade() {
    System.out.println("Idade: " + idade);
  }

  //getter
  public String getNome() {
    return nome;
  }
  //setter
  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
}
