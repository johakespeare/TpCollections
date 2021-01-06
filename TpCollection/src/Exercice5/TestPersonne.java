package Exercice5;

import java.util.ArrayList;
import java.util.Collections;

public class TestPersonne {

    public static void main(String[] args) {

        Personne p = new Personne("Fericean","Johanna",20);
        Personne p1 = new Personne("Comiti","Ghinevra",20);
        Personne p2 = new Personne("Aire","Axel",15);
        Personne p3 = new Personne("Poirot","Hercules",50);
        Personne p4= new Personne("Haddock","Archibald",47);
        Personne p5 = new Personne("Comiti","Ghinevra",20);

        ArrayList<Personne> liste = new ArrayList<>();

        liste.add(p);
        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
        liste.add(p4);
        liste.add(p5);

        Collections.sort(liste);
        System.out.println(liste);


    }

}
