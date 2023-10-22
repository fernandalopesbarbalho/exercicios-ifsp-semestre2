public class CogumeloRoxo extends Fungo implements ItemMagico {
  public void aplicarEfeitoMagico(Player jogador) {
    jogador.aumentarDefesaMagica(10);
  }
}