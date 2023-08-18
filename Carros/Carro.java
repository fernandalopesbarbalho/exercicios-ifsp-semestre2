class Carro {
  //atributos
  public int ano;
  public String marca;
  public String modelo;
  public String cor;

  //métodos
  public void exibirModelo() {
    System.out.println("\nModelo: " + modelo);
  }

  public void exibirAnoECor() {
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
  }
}