public class Frango extends Carnes implements ItemMagico {
  public void aplicarEfeitoMagico(Player jogador) {
    jogador.aumentarForca(10);
  }
}