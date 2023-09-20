/*
1. Você foi contratado para produzir o comportamento de uma certa arma num jogo de mago. 
2. A arma terá comportamento diferentes dependendo do tipo de combinação de pedras elementos que ela receber.
3. Cada pedra elemento tem um nível de força básico daquele elemento. E todo elemento descende da classe PedraElemento.
4. Os elementos primários existentes são fogo, água, terra, ar
  1. Logo teremos PedraFogo, PedraAgua etc como classses
5. Combinações possíveis 
  1. Fogo e  ar = combustão 
  2. fogo e terra = lava
  3. Terra e agua. = planta
  4. agua e ar = neve
6. Você deve uma classe Cajado que tenha um método executarPoderElemental(). Ele recebera duas referencias dessas pedras. 
  1. Se ele tiver duas referencias de pedras primaria do mesmo tipo (ex pedraFogo e PedraFogo) terá um poder de fogo
  2. Se for do tipo diferente, executar a combinação 
7. Testar todas as possibilidades no Main.
*/

class Main {
  public static void main(String[] args) {
    PedraFogo fogo1 = new PedraFogo(7);
    PedraFogo fogo2 = new PedraFogo(2);
    PedraAgua agua1 = new PedraAgua(3);
    PedraAgua agua2 = new PedraAgua(5);
    PedraTerra terra1 = new PedraTerra(8);
    PedraTerra terra2 = new PedraTerra(1);
    PedraAr ar1 = new PedraAr(12);
    PedraAr ar2 = new PedraAr(9);

    Cajado cajado = new Cajado();

    cajado.executarPoderElemental(fogo1, fogo2);
    cajado.executarPoderElemental(agua1, agua2);
    cajado.executarPoderElemental(terra1, terra2);
    cajado.executarPoderElemental(ar1, ar2);
    cajado.executarPoderElemental(fogo1, ar1);
    cajado.executarPoderElemental(fogo1, terra1);
    cajado.executarPoderElemental(terra1, agua1);
    cajado.executarPoderElemental(agua1, ar1);
  }
}