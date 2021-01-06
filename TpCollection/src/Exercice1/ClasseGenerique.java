package Exercice1;

public class ClasseGenerique<T,U> {
    //************************************************attributs*********************************************************
    private T first;
    private U second;
    //**********************************************constructeurs*******************************************************

    public ClasseGenerique(T first, U second){
        this.first=first;
        this.second=second;
    }

    //*************************************************méthodes*********************************************************

    public T getFirst() {
        return this.first;
    }
    public U getSecond() {
        return this.second;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "ClasseGenerique{" +
                "first = " + first +
                ", second = " + second +
                '}';
    }

    //******************************************************************************************************************






}
