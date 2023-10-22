public class Grama extends Terrestre {
  private int defesaGrama;

  public Grama(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaGrama) {
    super(nome, nivelMalemolencia, defesa, defesaTerrestre);
    this.defesaGrama = defesaGrama;
  }

  public int getDefesaGrama() {
    return defesaGrama;
  }
}