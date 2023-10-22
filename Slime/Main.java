/*
O slime é uma criatura adaptável de acordo com o lugar em que vive, podendo nascer "puro" ou com alguma adaptação.

O slime básico possui os atributos de nome, nivelMalemolencia e defesa.

O slime terrestre herda tudo que o slime básico tem e possui a defesaTerrestre.
O slime grama herda tudo que o terrestre tem e possui a defesaGrama.
O slime arenoso herda tudo que o terrestre tem e possui a defesaAreia.
O slime vulcânico herda tudo que o terrestre tem e possui a defesaVulcao.

O slime aquático herda tudo que o slimeBasico tem e possui a defesaAgua.
O slime marítimo herda tudo que o  aquatico tem e possui a defesaAguaSalgada.
O slime venenoso herda tudo que o  aquatico tem e possui a defesaVeneno.

Crie construtores que receba todos os atributos. Reutilize todos os construtores possíveis.
*/

class Main {
  public static void main(String[] args) {
    SlimeBasico basico = new SlimeBasico("Slime Básico", 9, 11);
    Terrestre terrestre = new Terrestre("Slime Terrestre", 5, 22, 66);
    Grama grama = new Grama("Slime Grama", 4, 37, 40, 99);
    Arenoso arenoso = new Arenoso("Slime Arenoso", 2, 90, 15, 0);
    Vulcanico vulcanico = new Vulcanico("Slime Vulcânico", 1, 51, 45, 17);
    Aquatico aquatico = new Aquatico("Slime Aquático", 8, 62, 52);
    Maritimo maritimo = new Maritimo("Slime Marítimo", 6, 7, 65, 21);
    Venenoso venenoso = new Venenoso("Slime Venenoso", 3, 89, 75, 30);

    System.out.println(basico.getNome() + ":\n - Nível de Malemolência: " + basico.getNivelMalemolencia()  + "\n - Defesa: " + basico.getDefesa());
    System.out.println("\n" + terrestre.getNome()  + ":\n - Nível de Malemolência: " + terrestre.getNivelMalemolencia() + "\n - Defesa Terrestre: " + terrestre.getDefesaTerrestre());
    System.out.println("\n" + grama.getNome() + ":\n - Nível de Malemolência: " + grama.getNivelMalemolencia() + "\n - Defesa Grama: " + grama.getDefesaGrama());
    System.out.println("\n" + arenoso.getNome() + ":\n - Nível de Malemolência: " + arenoso.getNivelMalemolencia() + "\n - Defesa Areia: " + arenoso.getDefesaAreia());
    System.out.println("\n" + vulcanico.getNome() + ":\n - Nível de Malemolência: " + vulcanico.getNivelMalemolencia() + "\n - Defesa Vulcão: " + vulcanico.getDefesaVulcao());
    System.out.println("\n" + aquatico.getNome() + ":\n - Nível de Malemolência: " + aquatico.getNivelMalemolencia() + "\n - Defesa Água: " + aquatico.getDefesaAgua());
    System.out.println("\n" + maritimo.getNome() + ":\n - Nível de Malemolência: " + maritimo.getNivelMalemolencia() + "\n - Defesa Água Salgada: " + maritimo.getDefesaAguaSalgada());
    System.out.println("\n" + venenoso.getNome() + ":\n - Nível de Malemolência: " + venenoso.getNivelMalemolencia() + "\n - Defesa Veneno: " + venenoso.getDefesaVeneno());
  }
}