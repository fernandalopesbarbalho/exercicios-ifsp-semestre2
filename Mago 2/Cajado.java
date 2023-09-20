public class Cajado {
  public void executarPoderElemental(PedraFogo pedra1, PedraFogo pedra2) {
    System.out.println("Poder de Fogo");
  }

  public void executarPoderElemental(PedraAgua pedra1, PedraAgua pedra2) {
    System.out.println("Poder de Água");
  } 

  public void executarPoderElemental(PedraTerra pedra1, PedraTerra pedra2) {
    System.out.println("Poder de Terra");
  }

  public void executarPoderElemental(PedraAr pedra1, PedraAr pedra2) {
    System.out.println("Poder de Ar");
  }

  public void executarPoderElemental(PedraFogo pedra1, PedraAr pedra2) {
    System.out.println("Combustão");
  }
  public void executarPoderElemental(PedraAr pedra1, PedraFogo pedra2) {
    System.out.println("Combustão");
  }

  public void executarPoderElemental(PedraFogo pedra1, PedraTerra pedra2) {
    System.out.println("Lava");
  }
  public void executarPoderElemental(PedraTerra pedra1, PedraFogo pedra2) {
    System.out.println("Lava");
  }

  public void executarPoderElemental(PedraTerra pedra1, PedraAgua pedra2) {
    System.out.println("Planta");
  }
  public void executarPoderElemental(PedraAgua pedra1, PedraTerra pedra2) {
    System.out.println("Planta");
  }

  public void executarPoderElemental(PedraAgua pedra1, PedraAr pedra2) {
    System.out.println("Neve");
  }
  public void executarPoderElemental(PedraAr pedra1, PedraAgua pedra2) {
    System.out.println("Neve");
  }
}