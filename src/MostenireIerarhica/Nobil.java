package MostenireIerarhica;

public class Nobil extends Cler{
    private int supusi;
    private int avere;
    Main nume = new Main();

    public Nobil(String nume, String ocupatie, String resedinta, int supusi, int avere) {
        super(nume, ocupatie, resedinta);
        this.supusi = supusi;
        this.avere = avere;
    }
    public int getSupusi() {
        return supusi;
    }

    public int getAvere() {
        return avere;
    }

    public void setSupusi(int supusi) {
        this.supusi = supusi;
    }

    public void setAvere(int avere) {
        this.avere = avere;
    }

    @Override
    public String toString() {
        return "Nobil{" +
                "nume= " + getNume() +
                " ,ocupatie= " + getOcupatie() +
                " ,resedinta= " + getResedinta() +
                " ,supusi= " + supusi +
                " ,avere= " + avere +
                "} ";
    }

    @Override
    public void prezentare() {
        System.out.print("Bucurati-va pentru stapanul vostru nobilul ");
    }
}
