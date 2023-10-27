package Apprentissage;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Care obiect doriti sa-l creati? \n 1 - Student \n 2 - Cipsuri \n 3 - Carte \n 4 - Masina \n");

        Scanner cin = new Scanner(System.in);
        int alegere = cin.nextInt();
        int schimbare = -1;

        switch (alegere){
            case 1:
                System.out.println("Ati ales \"Student\" \n Introduceti nume(String), prenume(String), varsta(int), grupa(String)");
                Student student1 = new Student(cin.next(), cin.next(), cin.nextInt(), cin.next());
                System.out.println(student1.toString());
                System.out.print("Daca vrei sa faci vreo schimbare tasteaza 1, daca nu tasteaza 2\n");
                schimbare = cin.nextInt();

                if (schimbare == 1) {
                    System.out.println("Introdu modificarile");
                    student1.setNume(cin.next());
                    student1.setPrenume(cin.next());
                    student1.setVarsta(cin.nextInt());
                    student1.setGrupa(cin.next());
                }
                System.out.println(student1.toString());
                break;
            case 2:
                System.out.println("Ati ales \"Cipsuri\" \n Introduceti denumire(String), grame(int), gust(String), reducere(String)");
                Cipsuri cipsuri1 = new Cipsuri(cin.next(), cin.nextInt(), cin.next(), cin.next());
                System.out.println(cipsuri1.toString());
                System.out.print("Daca vrei sa faci vreo schimbare tasteaza 1, daca nu tasteaza 2\n");
                schimbare = cin.nextInt();

                if (schimbare == 1) {
                    System.out.println("Introdu modificarile");
                    cipsuri1.setDenumire(cin.next());
                    cipsuri1.setGrame(cin.nextInt());
                    cipsuri1.setGust(cin.next());
                    cipsuri1.setReducere(cin.next());
                }
                System.out.println(cipsuri1.toString());
                break;
            case 3:
                System.out.println("Ati ales \"Carte\" \n Introduceti denumire(String), autor(String), anul(int), categorie(String)");

                Carte carte1 = new Carte(cin.next(), cin.next(), cin.nextInt(), cin.next());
                System.out.println(carte1.toString());
                System.out.print("Daca vrei sa faci vreo schimbare tasteaza 1, daca nu tasteaza 2\n");
                schimbare = cin.nextInt();

                if (schimbare == 1) {
                    System.out.println("Introdu modificarile");
                    carte1.setDenumire(cin.next());
                    carte1.setAutor(cin.next());
                    carte1.setAnul(cin.nextInt());
                    carte1.setCategorie(cin.next());
                }
                System.out.println(carte1.toString());
                break;
            case 4:
                System.out.println("Ati ales \"Masina\" \n Introduceti marca(String), culoarea(String), anul(int), pretul(int)");
                Masina masina1 = new Masina(cin.next(), cin.next(), cin.nextInt(), cin.nextInt());
                System.out.println(masina1.toString());
                System.out.print("Daca vrei sa faci vreo schimbare tasteaza 1, daca nu tasteaza 2\n");
                schimbare = cin.nextInt();

                if (schimbare == 1) {
                    System.out.println("Introdu modificarile");
                    masina1.setMarca(cin.next());
                    masina1.setCuloare(cin.next());
                    masina1.setAn(cin.nextInt());
                    masina1.setPret(cin.nextInt());
                }
                System.out.println(masina1.toString());
                break;
        }
    }
}
