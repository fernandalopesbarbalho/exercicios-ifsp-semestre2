public class CogumeloAzul extends Fungo implements ItemMagico {
  public void aplicarEfeitoMagico(Player jogador) {
    jogador.aumentarInteligencia(10);
  }
}