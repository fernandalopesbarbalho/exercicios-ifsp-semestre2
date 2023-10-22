public class Maritimo extends Aquatico {
  private int defesaAguaSalgada;

  public Maritimo(String nome, int nivelMalemolencia, int defesa, int defesaAgua, int defesaAguaSalgada) {
    super(nome, nivelMalemolencia, defesa, defesaAgua);
    this.defesaAguaSalgada = defesaAguaSalgada;
  }

  public int getDefesaAguaSalgada() {
    return defesaAguaSalgada;
  }
}