//classe base para todos os personagens, onde está inserido o padrão strategy, pois a interação entre a classe Personagem e a interface Arma faz a troca de armas sem que haja a necessidade de alterar a classe Personagem
class Personagem {
  private String nome;
  private Arma arma;

  public Personagem(String nome) {
    this.nome = nome;
  }

  //verifica se o personagem tem uma arma para executar o ataque
  public void executarAtaque() {
    if (arma != null) {
      System.out.println(nome + " atacou");
      arma.atacar();
    }
  }

  //faz a troca de armas
  public void novaArma(Arma arma) {
    this.arma = arma;
  }
}