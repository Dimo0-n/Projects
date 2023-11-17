package MostenireIerarhica;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Cine doresti sa fii?\n 1 - Om simplu\n 2 - Cler\n 3 - Nobil\n 4 - Rege");
        int alegere = cin.nextInt();
        System.out.println("Alegeti numele de personaj:");
        String numePersonaj = cin.next();

        Persoana persoana1 = new OmSimplu("John", "morar");
        Persoana persoana2 = new Cler("Eliot", "preot", "manastire");
        Persoana persoana3 = new Nobil("Richard", "titular", "conac", 68, 15302);
        Persoana persoana4 = new Rege("Arthur", "monarh", "palat", 33548, 3151202, 24, 7564);

        if (alegere == 1){
            persoana1.setNume(numePersonaj);
                persoana1.prezentare();
                System.out.println(numePersonaj);
                System.out.println(persoana1.Interact());
                System.out.println("Si asta e povestea mea :");
                System.out.println(persoana1);
            }
        if (alegere == 2){
            persoana2.setNume(numePersonaj);
                persoana2.prezentare();
                System.out.println(numePersonaj);
                System.out.println(persoana2.Interact(persoana4));
                System.out.println("Si asta e povestea mea :");
                System.out.println(persoana2);
            }
        if (alegere == 3){
            persoana3.setNume(numePersonaj);
                persoana3.prezentare();
                System.out.println(numePersonaj);
                System.out.println(persoana3.Interact(persoana1, persoana4));
                System.out.println("Si asta e povestea mea :");
                System.out.println(persoana3);
            }
        if (alegere == 4){
            persoana4.setNume(numePersonaj);
                persoana4.prezentare();
                System.out.println(numePersonaj);
                System.out.println(persoana4.Interact(persoana1, persoana2, persoana3));
                System.out.println("Si asta e povestea mea :");
                System.out.println(persoana4);
            }
        }
    }