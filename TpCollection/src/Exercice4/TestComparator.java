package Exercice4;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {


    public static void main(String[] args) {

        ArrayList<String> maListe = new ArrayList<>();
        Collections.addAll(maListe, args);

        MotsComparator m = new MotsComparator(maListe,"lexico");
        MotsComparator m1 = new MotsComparator(maListe,"militaire");
        MotsComparator m2= new MotsComparator(maListe,"inverse");




    }
}
