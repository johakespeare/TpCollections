package Exercice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortedInteger {
    //************************************************attributs*********************************************************

    private ArrayList<Integer> collection;
    private TreeSet<Integer> ensemble;


    //*************************************************méthodes*********************************************************

    /**
     * Cette fonction crée unearraylist contenant des nombres aléatoires ompris entre 0 et 1000 (inclus),
     * qu'elle trie ensuite dans l'ordre croissant
     * @param nb nombre de nombres qui seront dans la liste
     */
    public void create(int nb){
        if(nb<0){
            throw new IllegalArgumentException("Une liste doit contenir un nombre positif d'éléments ! ");
        }
        collection=new ArrayList<Integer>();
        for(int i=0; i<nb;i++){
            int j=(int)(Math.random()*1000);
            collection.add(j);
        }
        Collections.sort(collection);
        for (Integer integer : collection) {
            System.out.println(integer);
        }
    }

    /**
     * crée un ensemble ordonné de nb nombres aléatoires. Chaque nombre est présent au maximupm une fois.
     * @param nb
     */
    public void createSet(int nb){
        ensemble=new TreeSet<Integer>();
        for(int i=0; i<nb; i++){
            int j=(int)(Math.random()*10);
            ensemble.add(j);
        }
        System.out.println(ensemble);
    }



}
