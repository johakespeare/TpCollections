package Exercice5;

public class Personne implements Comparable<Personne>{

    //************************************************ATTRIBUTS*********************************************************

    private String nom;
    private String prenom;
    private int age;

    //**********************************************CONSTRUCTEURS*******************************************************

    /**
     * constructeur de la classe Personne
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(String nom, String prenom, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    //*******************************************GETTERS ET SETTERS*****************************************************

    public String getNom() {
        return this.nom;
    }
    public String getPrenom(){ return this.prenom;}
    public int getAge() {
        return this.age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom){ this.prenom=prenom;}
    public void setAge(int age) {
        this.age = age;
    }

    //***********************************************METHODES***********************************************************
    @Override
    public String toString() {
        return this.prenom +" "+this.nom +" est agé(e) de "+ this.age;
    }


    @Override
    public int compareTo(Personne o) {
        int result;
        if (this.age==o.age){
            if(this.nom.equals(o.nom)){
                if(this.prenom.equals(o.prenom)){
                    result=0;
                }
                else{
                    result=this.prenom.length()-o.prenom.length();
                }
            }
            else{
                result=this.nom.length()-o.nom.length();
            }
        }
        else{
            result=this.age-o.age;
        }
    return result;
    }
}
