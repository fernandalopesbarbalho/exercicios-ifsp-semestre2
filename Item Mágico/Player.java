public class Player {
  private int forca, inteligencia, defesaMagica, defesaFisica;
  
  public Player(int forca, int inteligencia, int defesaMagica, int defesaFisica) {
    this.forca = forca;
    this.inteligencia = inteligencia;
    this.defesaMagica = defesaMagica;
    this.defesaFisica = defesaFisica;
  }
  
  public int getForca() {
    return forca;
  }
  public int getInteligencia() {
    return inteligencia;
  }
  public int getDefesaMagica() {
    return defesaMagica;
  }
  public int getDefesaFisica() {
    return defesaFisica;
  }
  
  public void aumentarForca(int valor) {
    this.forca += valor;
  }

  public void aumentarInteligencia(int valor) {
    this.inteligencia += valor;
  }

  public void aumentarDefesaMagica(int valor) {
    this.defesaMagica += valor;
  }
  
  public void aumentarDefesaFisica(int valor) {
    this.defesaFisica += valor;
  }

  public void exibirPoderes() {
    System.out.println("Poderes do Player:");
    System.out.println("-Força: " + this.forca);
    System.out.println("-Inteligência: " + this.inteligencia);
    System.out.println("-Defesa Mágica: " + this.defesaMagica);
    System.out.println("-Defesa Física: " + this.defesaFisica);
  }  
}