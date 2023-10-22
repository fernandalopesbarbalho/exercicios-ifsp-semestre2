/*
- Todo player tem atributos: força, inteligencia, defesa magica e defesa fisica.
- Todo item tem o comportamento de alterar algum atributo do player.
- Fungos sempre adicionam mais 5 de inteligência e algum outro comportamento específico.
- Carnes sempre adicionam 5 a força e algum outro comportamento específico.
- Sobre os comportamentos específicos: cogumelo azul adiciona +10 em inteligência, o roxo +10 em def mágica, frango adiciona +10 em força e peixe adiciona +10 em def fisica.
- Você deve garantir que todo novo item adicionado no sistema tenha um método específico que aplique o efeito no player.

Exercício:
Crie todas as classes que comportem essas especificações. 

Requisitos:
1- Crie duas árvores de heranças.
2- Duas classes devem ser abstratas.
3- Deve ter ao menos uma interface.
4- Crie você um item mágico que altere os status do player sem quebrar o sistema (pense no contrato que sua classe deve seguir).
*/

class Main {
  public static void main(String[] args) {
    Player jogador = new Player(100, 50, 60, 20);
    System.out.println("INÍCIO");
    jogador.exibirPoderes();

    CogumeloAzul cogumeloAzul = new CogumeloAzul();
    cogumeloAzul.aplicarEfeito(jogador);
    cogumeloAzul.aplicarEfeitoMagico(jogador);
    
    CogumeloRoxo cogumeloRoxo = new CogumeloRoxo();
    cogumeloRoxo.aplicarEfeito(jogador);
    cogumeloRoxo.aplicarEfeitoMagico(jogador);

    Peixe peixe = new Peixe();
    peixe.aplicarEfeito(jogador);
    peixe.aplicarEfeitoMagico(jogador);

    Frango frango = new Frango();
    frango.aplicarEfeito(jogador);
    frango.aplicarEfeitoMagico(jogador);

    System.out.println("\nFIM");
    jogador.exibirPoderes();
  }
}