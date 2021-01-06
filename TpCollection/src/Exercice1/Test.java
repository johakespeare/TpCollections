package Exercice1;

import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {

        //--------------------------------------------TEST n°1----------------------------------------------------------

        Personne perso1 = new Personne("Pierre",40);
        ClasseGenerique<String,Personne> c1= new ClasseGenerique<String,Personne>("equipeRouge",perso1);

        assert(c1.getFirst()=="equipeRouge"):"nom != equipeRouge "+ c1.getFirst();
        assert(c1.getSecond()==perso1):"personne != perso1"+ c1.getSecond();

        System.out.println(c1.toString());
        System.out.println(c1.getSecond().toString());

        //--------------------------------------------TEST n°2----------------------------------------------------------

         int entier = 13;
        GregorianCalendar date = new GregorianCalendar();
        ClasseGenerique<Integer,GregorianCalendar> c2 = new ClasseGenerique<Integer,GregorianCalendar>(entier,date);

        assert(c2.getFirst()==13):"entier != 13 "+ c2.getFirst();
        assert(c2.getSecond()== date):"mauvaise date"+ c2.getSecond();

        System.out.println(c2.toString());




    }
}
