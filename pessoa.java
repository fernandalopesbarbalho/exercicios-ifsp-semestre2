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

class Main {
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