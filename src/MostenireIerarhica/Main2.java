package MostenireIerarhica;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Persoana persoana1 = new OmSimplu("Eliot", "morar");
        Persoana persoana2 = new Cler("John", "preot", "manastire");
        Persoana persoana3 = new Nobil("Richard", "titular", "conac", 68, 15302);
        Persoana persoana4 = new Rege("Arthur", "monarh", "palat", 33548, 3151202, 24, 7564);

        System.out.println("\nPolimorfism la nivel de runtime\n");
        List<Persoana> list = List.of(persoana1, persoana2, persoana3, persoana4);
        for(Persoana persoana: list){
            persoana.prezentare();
            System.out.println("Si asta e povestea mea:\n" + persoana + "\n");
            System.out.println("-------------------------------------------------------------");
        }

        //la nivel de compilare
        System.out.println(" " + persoana1.Interact());
        System.out.println("-------------------------------------------------------------");
        System.out.println(" " + persoana2.Interact(persoana4));
        System.out.println("-------------------------------------------------------------");
        System.out.println(" " + persoana3.Interact(persoana1, persoana4));
        System.out.println("-------------------------------------------------------------");
        System.out.println(" " + persoana4.Interact(persoana1, persoana2, persoana3));
    }
}
