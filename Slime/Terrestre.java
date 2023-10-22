public class Terrestre extends SlimeBasico {
  private int defesaTerrestre;

  public Terrestre(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre) {
    super(nome, nivelMalemolencia, defesa);
    this.defesaTerrestre = defesaTerrestre;
  }

  public int getDefesaTerrestre() {
    return defesaTerrestre;
  }
}