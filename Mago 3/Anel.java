public class Anel {
  private int poderAnel;
  
  public Anel(int poderAnel) {
    this.poderAnel = poderAnel;
  }
  public int getPoderAnel() {
    return poderAnel;
  }

  public int escolherPedra(PedraElemento pedra) {
    int valorPedra = pedra.getForcaNucleo() + getPoderAnel();
    return valorPedra;
  }
}