/*
1. Crie uma classe chamada Pessoa
  1. Atributos : nome e idade (privados)
  2. métodos:
    dizerNome()
    dizerIdade()
    getter e setter das variáveis 
2. No método main:
  1. Criar um objeto Pessoa e usar todos os métodos!
*/

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

  public static void main(String[] args) {
    //objeto eu
    Pessoa eu = new Pessoa();
    
    //alterar informaçoes com set
    eu.setNome("Fernanda");
    eu.setIdade(18);
    
    //invocar os métodos
    eu.dizerNome();
    eu.dizerIdade();
  }
}
