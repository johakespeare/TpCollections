package Exercice2;

import java.util.* ;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AnaCount {

    //************************************************ATTRIBUTS*********************************************************

    ArrayList<String> mots = new ArrayList<>(); // ArrayList contenant les mots du fichier
    HashMap<String,ArrayList<String>> mapMots=new HashMap<>();

    //*************************************************METHODES*********************************************************

    /**
     * Cette fonction indique si deux chaînes de caractères passées en paramètre sont des anagrammes ou non
     * @param st1 chaîne de caractères 1
     * @param st2 chaîne de caractères 2
     * @return true si ce sont des anagrammes, false sinon
     */
    public boolean checkAnagram(String st1, String st2){
           boolean res;
           if(!(st1 != null || st2 != null)){
               throw new NullPointerException(" les chaines de caractères sont nulles!");
           }
           if(st1.length()!= st2.length()){
               res=false;
           }
           else {
               char[] a = st1.toCharArray();
               char[] b = st2.toCharArray();
               Arrays.sort(a);
               Arrays.sort(b);
               res = Arrays.equals(a,b);
           }
           return res;
    }

    /**
     * Lit un fichier et entre ses résultats dans l'arrayList "mots"
     * @param path chemin menant au fichier
     */
    public void fillist(String path){
            try{
                Scanner scan = new Scanner(new File(path));
                while(scan.hasNext()){
                    mots.add(scan.next());
                }
            }catch(FileNotFoundException e){
                System.err.println("Le fichier est introuvable, vous l'avez sûrement mal rangé !" );
            }
    }

    /**
     * Pour un mot passé en paramètre, on stocke ses anagrammes (ceux qui sont dans l'arryList "mots",
     * et donc dans le fichier), dans une autre arrayList
     * @param mot
     * @return l'arrylist contenant les anagrammes de "mot"
     */
    public ArrayList<String> fillArray(String mot){
            ArrayList<String> res=new ArrayList<>();
            for(String mau : mots){
                if(checkAnagram(mot,mau)){
                    res.add(mau);
                }
            }
            return res;
    }

    /**
     * On remplit la Multimap avec les arraylist contenant les anagrammes, obtenues grâce à la fonction précédente
     */
    public void fillmap(){
            for(String mot : mots) {
                mapMots.put(mot,fillArray(mot));
            }
        }

    /**
     * Affiche les mots contenant plus de nb anagrammes, et leurs anagrammes
     * @param nb
     */
    public void affiche(int nb) {
        if (nb < 0) {
            throw new IllegalArgumentException("le nombre doit être supérieur ou égal à 0 !");
        }

        for (Map.Entry<String, ArrayList<String>> mapentry : mapMots.entrySet()) {

            if ((mapentry.getValue()).size() >= nb) {
                System.out.println("clé " + mapentry.getKey() + " valeur : ");
                ArrayList<String> liste = mapentry.getValue();
                for (String m : liste) {
                    System.out.println(m);
                }
            }
        }
    }

    public void fonctionFinale(int nb, String path){
        fillist(path);
        fillmap();
        affiche(nb);
    }







}
