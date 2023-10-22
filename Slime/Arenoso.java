public class Arenoso extends Terrestre {
  private int defesaAreia;

  public Arenoso(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaAreia) {
    super(nome, nivelMalemolencia, defesa, defesaTerrestre);
    this.defesaAreia = defesaAreia;
  }
  
  public int getDefesaAreia() {
    return defesaAreia;
  }
}