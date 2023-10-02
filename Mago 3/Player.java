public class Player {
  private int poderAtaque;
  private int poderDefesa;

  public Player(int poderAtaque, int poderDefesa) {
    this.poderAtaque = poderAtaque;
    this.poderDefesa = poderDefesa;
  }
  public int getPoderAtaque() {
    return poderAtaque;
  }
  public int getPoderDefesa() {
    return poderDefesa;
  }

  public int calcularPoderTotalAtaque(int nucleoCajado) {
    return nucleoCajado + poderAtaque;
  }

  public int calcularPoderTotalDefesa(int nucleoAnel) {
    return nucleoAnel + poderDefesa;
  }
}