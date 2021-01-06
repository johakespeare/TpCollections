package Exercice4;

import java.util.*;

public class MotsComparator{

    //***********************************************CONSTRUCTEURS******************************************************

    /**
     * Constructeur de la classe MotsComparator
     */
    public MotsComparator(){

    }

    /**
     * Constructeur de la classe MotsComparator(celui de l'étape 1 avant modification)
     * @param liste
     */
    public MotsComparator(ArrayList<String> liste){
        liste.sort(LEXICAL);
        System.out.print("tri lexicographique = "+liste);
        liste.sort(MILITAIRE);
        System.out.print("tri militaire = "+liste);
        liste.sort(LEXICAL.reversed());
        System.out.print("tri inverse lexico = "+liste);

    }

    /**
     * Constructeur de la calsse MotsComparator
     * @param liste
     * @param affichage
     */
    public MotsComparator(ArrayList<String> liste, String affichage){
        if(affichage.equals("lexico")){
            liste.sort(LEXICAL);
            System.out.print("tri lexico = "+liste);
        }
        else if(affichage.equals("inverse")){
            liste.sort(LEXICAL.reversed());
            System.out.print("tri inverse lexico = "+liste);
        }
        else if(affichage.equals("militaire")){
            liste.sort(MILITAIRE);
            System.out.print("tri militaire = "+liste);
        }
        else{
            throw new IllegalCallerException("les affichages possibles sont 'lexico','inverse' et 'militaire'");
        }

    }


    /**
     * Comparateur lexical
     */
    public static final Comparator<String> LEXICAL =
            new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            };

    /**
     * Comparateur militaire
     */
    public static final Comparator<String> MILITAIRE =
            new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    int result;

                    result = o1.length()-o2.length();
                    if(result==0){
                        result=o1.compareTo(o2);
                    }
                    return result;
                }
            };





    }
