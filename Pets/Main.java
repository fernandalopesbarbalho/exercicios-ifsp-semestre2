/*
1. Crie a mesma a seguinte sequencia de herança:
2. Animal>>Canino>>Cao 
3. Animal>>Felino>> Gato
4. Robo>>Caotron
5. Robo>>Mechanigato
6. Crie as classes animal, Felino e Canino como abstratas. Animal tem metodo comportamento() que mostra uma mensagem no console "se comportando como um animal"
7. Sobrescreva Canino e Felino e mude a mensagem do método para "se comportando como um Felino" ou "se comportando como um Canino" 
8. Fazer os getter e setter de todos:
  1. Cao tem nome e raca
  2. Gato tem nome e raca
  3. Caotron tem modelo e numeroSerie
  4. Mechanigato tem modelo e numeroSerie
9. Cao, Gato, Caotron e Mechanigato sao tipos Pet, ou seja, tem um metodo brincar(). Crie uma interface de Pet e faca todas essas classes implementar brincar():
10. Cada classe deve implementar esse metodo com a seguinte mensagem "classe esta brincando" onde classe deve ser substituido pela classe em questao (cao, gato, caotron ou mechanigato)
11. No metodo Main :
  1. Crie um array com um objeto de cada tipo e percorra por ele chamando o brincar de cada objeto.
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Cao pingo = new Cao();
    pingo.setNome("Pingo");
    pingo.setRaca("Sem raça definida");
    
    Gato amora = new Gato();
    amora.setNome("Amora");
    amora.setRaca("Siamês");

    Caotron walle = new Caotron();
    walle.setModelo("Wall-e");
    walle.setNumeroSerie(2005);

    Mechanigato eva = new Mechanigato();
    eva.setModelo("Eva");
    eva.setNumeroSerie(2023);

    ArrayList<Pet> pets = new ArrayList<>();
    pets.add(pingo);
    pets.add(amora);
    pets.add(walle);
    pets.add(eva);

    for (Pet pet : pets) {
      pet.brincar();
      System.out.println();
    }
  }
}