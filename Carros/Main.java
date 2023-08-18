/*
1. Crie a classe: Carro.java e Main.java 
2. Adicione os atributos na classe carro:
  Ano (inteiro)
  marca (texto)
  modelo (texto)
  cor (texto)
3. Adicione os métodos na classe carro:
exibirModelo() - o método deverá um exibir o modelo do carro
exibirAnoECor() - o método deverá exibir o ano e a cor do carro
4. O arquivo Main.java deverá conter o método main
5. Crie um objeto carro1 com as seguintes características:
  Ano: 1980
  Marca: VW
  Modelo: Fusca
  Cor: Azul
  Invoque os métodos exibirModelo() e exibirAnoECor() para o objeto criado (carro1)
6. Crie um objeto com a referencia carroz com as seguintes características:
  Ano: 2000
  Marca: Ford
  Modelo: Fiesta
  Cor: Vermelho
  Invoque os métodos exibirModelo) e exibirAnoECor() para o objeto criado (carro2)
7. Crie um outro objeto referenciado pela variável meuCarro que carregará as informações que você escolher! (Escolha um carro qualquer e coloque as informações como dos exemplos anteriores!).
*/

class Main {
  public static void main(String[] args) {
    //objeto carro 1
    Carro carro1 = new Carro();
    carro1.ano = 1980;
    carro1.marca = "VW";
    carro1.modelo = "Fusca";
    carro1.cor = "Azul";

    //invocar os métodos
    carro1.exibirModelo();
    carro1.exibirAnoECor();

    Carro carro2 = new Carro();
    carro2.ano = 2000;
    carro2.marca = "Ford";
    carro2.modelo = "Fiesta";
    carro2.cor = "Vermelho";

    carro2.exibirModelo();
    carro2.exibirAnoECor();

    Carro meuCarro = new Carro();
    meuCarro.ano = 1997;
    meuCarro.marca = "VW";
    meuCarro.modelo = "Gol";
    meuCarro.cor = "Prata";

    meuCarro.exibirModelo();
    meuCarro.exibirAnoECor();
  }
}
