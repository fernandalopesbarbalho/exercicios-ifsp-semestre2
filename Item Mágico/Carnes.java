public abstract class Carnes extends Item {
  public void aplicarEfeito(Player jogador) {
    jogador.aumentarForca(5);
  }
}