public class Caotron extends Robo implements Pet {
  private String modelo;
  private int numeroSerie;

  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getNumeroSerie() {
    return numeroSerie;
  }
  public void setNumeroSerie(int numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public void brincar() {
    System.out.println("Caotron está brincando");
	}
}