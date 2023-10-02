public class Cajado {
  private int poderCajado;
    
  public Cajado(int poderCajado) {
    this.poderCajado = poderCajado;
  }
  public int getPoderCajado() {
    return poderCajado;
  }

  public int somarPedras(PedraElemento pedra1, PedraElemento pedra2) {
    int somaPedra = pedra1.getForcaNucleo() + pedra2.getForcaNucleo() + getPoderCajado();
    return somaPedra;
  }
}