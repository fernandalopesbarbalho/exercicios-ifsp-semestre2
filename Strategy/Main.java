/*
- Todo personagem tem um método executarAtaque() que usa uma arma.
- Toda Arma tem um método atacar().
- Crie classes que permitam trocas de armas rápidas.
- Para cada arma implementar texto: "Ataque feito com *nome da arma*!".
- Para executarAtaque() mostrar texto: "*Nome do personagem* atacou".
*/

class Main {
  public static void main(String[] args) {
    //criando os personagens e as armas
    Personagem rainha = new Personagem("Rainha");
    Personagem rei = new Personagem("Rei");
    Personagem troll = new Personagem("Troll");
    Personagem bobo = new Personagem("Bobo da Corte");

    Arma faca = new Faca();
    Arma machado = new Machado();
    Arma espada = new Espada();
    Arma cajado = new Cajado();

    //executando os ataques e demonstrando as armas
    rainha.novaArma(faca);
    rainha.executarAtaque();
    rainha.novaArma(machado);
    rainha.executarAtaque();

    rei.novaArma(espada);
    rei.executarAtaque();
    rei.novaArma(cajado);
    rei.executarAtaque();

    troll.novaArma(machado);
    troll.executarAtaque();
    troll.novaArma(espada);
    troll.executarAtaque();

    bobo.novaArma(cajado);
    bobo.executarAtaque();
    bobo.novaArma(faca);
    bobo.executarAtaque();
  }
}