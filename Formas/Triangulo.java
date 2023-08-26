class Triangulo extends Forma {
  public int base; 
  public int altura;

  public void calcularArea() {
    area = (base * altura)/2;
    System.out.println("Cálculo específico de triângulo: \nÁrea = " + area);
  }
}