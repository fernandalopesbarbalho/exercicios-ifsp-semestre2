public class Cao extends Canino implements Pet {
  private String nome;
  private String raca;

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRaca() {
    return raca;
  }
  public void setRaca(String raca) {
    this.raca = raca;
  }

  public void brincar() {
    System.out.println("Cão está brincando");
  }
}
