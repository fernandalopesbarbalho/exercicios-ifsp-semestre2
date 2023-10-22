public class Aquatico extends SlimeBasico {
  private int defesaAgua;

  public Aquatico(String nome, int nivelMalemolencia, int defesa, int defesaAgua) {
    super(nome, nivelMalemolencia, defesa);
    this.defesaAgua = defesaAgua;
  }

  public int getDefesaAgua() {
    return defesaAgua;
  }
}