package fr.mds.designpatterns.factory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
*
* @author tactfactory
*
* - Modifier le programme pour permettre de créer des Building au travers d'un design pattern "Factory" :
*   - 1 : Il existe 3 façon de créer des Building
*     - 1 : Créer aléatoirement pour toutes les classes du package courant qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites
*     - 2 : Créer depuis une chaine de caractère qui représente le "simpleName" de la classe à utiliser qui implémente
*         "Building", qui possède un constructeur vide, qui est publique et qui n'est pas abstraite
*     - 3 : Depuis une classe qui implémente "Building", qui possède un constructeur vide, qui est publique et qui
*         n'est pas abstraite
*   - 2 : Créer deux listes de building dans le point d'entré de l'application
*     - 1 : La première liste doit contenir 20 Building généré aléatoirement
*     - 2 : La deuxième doit contenir au moins une fois chaque classe qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites. En utilisant soit les chaine de
*         caractères ou les classes
*/
public class  FactoryTp1 {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    randomTown();
    System.out.println("---------------------------");
    manualTown();
  }

  private static void manualTown() {

  }

  private static void randomTown() throws IOException, ClassNotFoundException {
    List<Building> buildingList = new ArrayList<Building>();
    Factory builder = new ConcreteFactory();
    for (int i = 0; i < 21 ; i++) {
      buildingList.add(builder.constructBuilding());

    }
    for (Building building : buildingList) {
      building.doSmth();
    }
  }

}
