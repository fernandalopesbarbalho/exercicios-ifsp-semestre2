/*
1. Classes chamadas Quadrado, Circulo, Triangulo que tenham
  1. Atributos: cor (pode ser texto)
  2. Métodos:
    1. MostrarCor(): usar atributo cor
    2. CalcularArea()
      1. implementação: exibir uma msg ”calculo especifico de quadrado” (mudar para cada formato)
  3. Criar uma classe Forma que é mãe de todas as formas.
    Perceba o que deve ficar em Forma e o que deve ficar nas suas filhas(so fica nas filhas caso elas tenham algum comportamento específico).
2. Na classe main
  1. Criar uma instância de cada classe filha
  2. Colocar elas em um array (usar a abstração de Forma)
  3. Iterar por esse array
    1. para cada iteração, chamar métodos referente a área e a cor.
*/

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    Quadrado square = new Quadrado();
    square.cor = "roxo";
    square.lado = 5;

    Triangulo triangle = new Triangulo();
    triangle.cor = "magenta";
    triangle.base = 3;
    triangle.altura = 5;

    Circulo circle = new Circulo();
    circle.cor = "azul";
    circle.raio = 4;

    ArrayList<Forma> listaFormas = new ArrayList<>();
    listaFormas.add(square);
    listaFormas.add(triangle);
    listaFormas.add(circle);
    System.out.println(listaFormas);

    for (int i = 0; i < listaFormas.size(); i++) {
      listaFormas.get(i).calcularArea();
      listaFormas.get(i).mostrarCor();
      System.out.println();
    }
  }
}