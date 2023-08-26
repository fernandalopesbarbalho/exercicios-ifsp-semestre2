class Quadrado extends Forma {
  public int lado;

  public void calcularArea() {
    area = lado * lado;
    System.out.println("Cálculo específico de quadrado: \nÁrea = " + area);
  }
}