public class Venenoso extends Aquatico {
  private int defesaVeneno;

  public Venenoso(String nome, int nivelMalemolencia, int defesa, int defesaAgua, int defesaVeneno) {
    super(nome, nivelMalemolencia, defesa, defesaAgua);
    this.defesaVeneno = defesaVeneno;
  }

  public int getDefesaVeneno() {
    return defesaVeneno;
  }
}