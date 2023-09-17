public class Cajado {
  public void executarPoderElemental(PedraElemento pedra1, PedraElemento pedra2) {
    
    if (pedra1.getClass() == pedra2.getClass()) {
      if (pedra1 instanceof PedraFogo) {
        System.out.println("Poder de Fogo");
      } else if (pedra1 instanceof PedraAgua) {
        System.out.println("Poder de Água");
      } else if (pedra1 instanceof PedraTerra) {
        System.out.println("Poder de Terra");
      } else if (pedra1 instanceof PedraAr) {
        System.out.println("Poder de Ar");
      }
      
    } else {
      if ((pedra1 instanceof PedraFogo && pedra2 instanceof PedraAr) || (pedra2 instanceof PedraFogo && pedra1 instanceof PedraAr)) {
        System.out.println("Combustão");
      } else if ((pedra1 instanceof PedraFogo && pedra2 instanceof PedraTerra) || (pedra2 instanceof PedraFogo && pedra1 instanceof PedraTerra)) {
        System.out.println("Lava");
      } else if ((pedra1 instanceof PedraTerra && pedra2 instanceof PedraAgua) || (pedra2 instanceof PedraTerra && pedra1 instanceof PedraAgua)) {
        System.out.println("Planta");
      } else if ((pedra1 instanceof PedraAgua && pedra2 instanceof PedraAr) || (pedra2 instanceof PedraAgua && pedra1 instanceof PedraAr)) {
        System.out.println("Neve");
      }
    }
  }
}