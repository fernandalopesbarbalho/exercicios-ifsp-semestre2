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