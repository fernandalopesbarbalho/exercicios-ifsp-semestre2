class Circulo extends Forma {
  public int raio;
  
  public void calcularArea() {
    area = 3.14*(raio * raio);
    System.out.println("Cálculo específico de círculo: \nÁrea = " + area);
  }
}