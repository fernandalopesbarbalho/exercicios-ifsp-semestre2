public class Duelo {
  public void iniciarDuelo(int p1Poder, int p2Poder) {

    if (p1Poder > p2Poder) {
      System.out.println("Vencedor: Player 1 com " + p1Poder + " pontos");
    } else if (p1Poder < p2Poder) {
      System.out.println("Vencedor: Player 2 com " + p2Poder + " pontos");
    } else if (p1Poder == p2Poder) {
      System.out.println("Empate de " + p1Poder + " pontos");
    }
  }
}