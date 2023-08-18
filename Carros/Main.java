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