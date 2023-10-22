public class Peixe extends Carnes implements ItemMagico {
  public void aplicarEfeitoMagico(Player jogador) {
    jogador.aumentarDefesaFisica(10);
  }
}