import java.util.ArrayList;
import java.util.List;

public class Carrinho {
  private List<Produto> produtosCarrinho;
  private List<Double> descontos;
  
  public Carrinho() {
    produtosCarrinho = new ArrayList<>();
    descontos = new ArrayList<>();
  }

  public void adicionarProduto(Produto produto, int quantidade, double cupomDesconto) {
    for (int i = 0; i < quantidade; i++) {
      produtosCarrinho.add(produto);
      descontos.add(cupomDesconto);
    }
  }

  public double calcularTotal() {
    double total = 0;
    for (int i = 0; i < produtosCarrinho.size(); i++) {
      Produto produto = produtosCarrinho.get(i);
      double desconto = descontos.get(i);
      double preco = produto.getPreco();
      if (desconto > 0) {
        double valorDesconto = (desconto / 100) * preco;
        total += preco - valorDesconto;
      } else {
        total += preco;
      }
    }
    return total;
  }
}
