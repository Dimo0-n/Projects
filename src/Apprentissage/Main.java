package Apprentissage;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");

        Cipsuri cipsuri1 = new Cipsuri("Lays", 140, "Crab", "nu-i la reducere");
        Cipsuri cipsuri2 = new Cipsuri("O! Pret Mic", 130, "Cascaval", "este la reducere");
        Cipsuri cipsuri3 = new Cipsuri("Chipsters", 100, "Becon", "nu-i la reducere");

//        System.out.println(tip1.getDenumire() + " de " + tip1.getGust() + " " + tip1.getGrame() + "g " + tip1.getReducere());
//        System.out.println("------------------------------------");
//        System.out.println(tip2.getDenumire() + " " + tip2.getGust() + " " + tip2.getGrame() + "g " + tip2.getReducere());
//        System.out.println("------------------------------------");
//        System.out.println(tip3.getDenumire() + " " + tip3.getGust() + " " + tip3.getGrame() + "g " + tip3.getReducere());
//        System.out.println("------------------------------------");

        System.out.println(cipsuri1.toString());
        System.out.println(cipsuri2.toString());
        System.out.println(cipsuri3.toString());

        System.out.println("------------------------------------------------------------");

        Carte carte1 = new Carte("\"Amintiri din copilarie\"", "Ion Creanga", 1892, "povesti pentru copii");
        Carte carte2 = new Carte("\"Povara bunatatii noastre\"", "Ion Druta", 1963, "roman social");
        Carte carte3 = new Carte("\"Sarmanul Dioniss\"", "Mihai Eminescu", 1892, "fictinune Filosofica");

        System.out.println(carte1.toString());
        System.out.println(carte2.toString());
        System.out.println(carte3.toString());

        System.out.println("------------------------------------------------------------");

        Student student1= new Student("Ceban", "Ion", 19, "TI-225");
        Student student2 = new Student("Luchian", "Marcel", 20, "FI-202");
        Student student3 = new Student("Stamati", "Eduard", 22, "AI-192");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("------------------------------------------------------------");

        Masina masina1 = new Masina("Ford", "Alba", 2016, 25000);
        Masina masina2 = new Masina("Audi", "Negra", 2018, 34000);
        Masina masina3 = new Masina("Mercedes", "Gri", 2012, 15000);
        Masina masina4 = new Masina("BMW", "Albastra", 2020, 55000);

        System.out.println(masina1.toString());
        System.out.println(masina2.toString());
        System.out.println(masina3.toString());
        System.out.println(masina4.toString());
    }
}



