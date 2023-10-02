/*
Um jogador pode se equipar com um cajado ou um anel para lutar em um duelo.
O anel serve para a defesa, tem seu poder próprio que se soma com o poder de uma pedra elemental.
O cajado serve para o ataque, tem seu poder próprio que se soma com o poder de duas pedras elementais.
O jogador tem seu poder próprio para defesa e ataque que se soma com poder da arma que ele se equipa, formando o poder total de ataque ou defesa.
Em um duelo o jogador 1 sempre ataca. Vence o jogador com maior poder total.
*/

class Main {
  public static void main(String[] args) {
    PedraElemento fogo = new PedraFogo(10);
    PedraElemento agua = new PedraAgua(11);
    PedraElemento terra = new PedraTerra(8);
    PedraElemento vento = new PedraVento(9);

    Anel anel = new Anel(30);
    Cajado cajado = new Cajado(20);
    
    Player player1 = new Player(7, 5);
    Player player2 = new Player(2, 4);

    int nucleoAnel = anel.escolherPedra(agua);
    int nucleoCajado = cajado.somarPedras(fogo, vento);

    int poderTotalAtaque = player1.calcularPoderTotalAtaque(nucleoCajado);
    int poderTotalDefesa = player2.calcularPoderTotalDefesa(nucleoAnel);
    
    Duelo duelo = new Duelo();
    duelo.iniciarDuelo(poderTotalAtaque, poderTotalDefesa);
  }
}