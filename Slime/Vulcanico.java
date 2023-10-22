public class Vulcanico extends Terrestre {
  private int defesaVulcao;

  public Vulcanico(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaVulcao) {
    super(nome, nivelMalemolencia, defesa, defesaTerrestre);
    this.defesaVulcao = defesaVulcao;
  }

  public int getDefesaVulcao() {
    return defesaVulcao;
  }
}