public class SlimeBasico {
  private String nome;
  private int nivelMalemolencia;
  private int defesa;

  public SlimeBasico(String nome, int nivelMalemolencia, int defesa) {
    this.nome = nome;
    this.nivelMalemolencia = nivelMalemolencia;
    this.defesa = defesa;
  }

  public String getNome() {
    return nome;
  }
  public int getNivelMalemolencia() {
    return nivelMalemolencia;
  }
  public int getDefesa() {
    return defesa;
  }
}