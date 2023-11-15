/*
Em um sistema de mercado existem os produtos:
- Ossada de Boi = 10,00; 
- Pata de Goblin = 50,00; 
- Presas de Lobo  = 11,00;
- Cabeca de Ave = 40,00;
- Maca Podre = 5,00;
- Maca Envenenada = 20,00.
A classe carrinho soma os produtos da compra e é possível aplicar cupons de desconto em produtos específicos (em porcentagem). 
*/

class Main {
  public static void main(String[] args) {
    Produto ossadaBoi = new Produto("Ossada de Boi", 10.00);
    Produto pataGoblin = new Produto("Pata de Goblin", 50.00);
    Produto presasLobo = new Produto("Presas de Lobo", 11.00);
    Produto cabecaAve = new Produto("Cabeça de Ave", 40.00);
    Produto macaPodre = new Produto("Maça Podre", 5.00);
    Produto macaEnvenenada = new Produto("Maça Envenenada", 20.00);

    Carrinho carrinho = new Carrinho();

    carrinho.adicionarProduto(presasLobo, 3, 0); //quantidade e cupom
    carrinho.adicionarProduto(macaEnvenenada, 5, 5);
    carrinho.adicionarProduto(cabecaAve, 9, 0);

    double total = carrinho.calcularTotal();
    System.out.println("Preço total da compra 1: " + total);

    Carrinho carrinho2 = new Carrinho();

    carrinho2.adicionarProduto(ossadaBoi, 15, 5);
    carrinho2.adicionarProduto(pataGoblin, 6, 9);
    carrinho2.adicionarProduto(macaPodre, 11, 0);
    carrinho2.adicionarProduto(macaEnvenenada, 8, 0);

    double total2 = carrinho2.calcularTotal();
    System.out.println("\nPreço total da compra 2: " + total2);

    Carrinho carrinho3 = new Carrinho();

    carrinho3.adicionarProduto(ossadaBoi, 2, 40);
    carrinho3.adicionarProduto(pataGoblin, 3, 0);
    carrinho3.adicionarProduto(cabecaAve, 5, 30);
    carrinho3.adicionarProduto(presasLobo, 4, 0);
    carrinho3.adicionarProduto(macaEnvenenada, 15, 50);
    carrinho3.adicionarProduto(macaPodre, 11, 0);

    double total3 = carrinho3.calcularTotal();
    System.out.println("\nPreço total da compra 3: " + total3);
  }
}