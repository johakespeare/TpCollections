package Exercice1;

public class Personne {

    //************************************************ATTRIBUTS*********************************************************

    private String nom;
    private int age;

    //**********************************************CONSTRUCTEUR********************************************************

    /**
     * Constructeur de la classe Personne
     * @param nom = nom de la Personne
     * @param age = age de la Personne
     */
    public Personne(String nom, int age){
        this.nom=nom;
        this.age=age;
    }

    //*******************************************GETTERS ET SETTERS*****************************************************


    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //***********************************************METHODES***********************************************************

    @Override
    public String toString() {
        return this.nom +" est agé(e) de "+ this.age;
    }


}
