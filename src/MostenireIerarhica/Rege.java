package MostenireIerarhica;
public class Rege extends Nobil{
    private int aniDomnire;
    private int soldati;

    public Rege(String nume, String ocupatie, String resedinta, int supusi, int avere, int aniDomnire, int soldati) {
        super(nume, ocupatie, resedinta, supusi, avere);
        this.aniDomnire = aniDomnire;
        this.soldati = soldati;
    }

    public int getAniDomnire() {
        return aniDomnire;
    }

    public int getSoldati() {
        return soldati;
    }

    public void setAniDomnire(int aniDomnire) {
        this.aniDomnire = aniDomnire;
    }

    public void setSoldati(int soldati) {
        this.soldati = soldati;
    }

    @Override
    public String toString() {
        return "Rege{" +
                " nume= " + getNume() +
                " ,ocupatie= " + getOcupatie() +
                " ,resedinta= " + getResedinta() +
                " ,supusi= " + getSupusi() +
                " ,avere= " + getAvere() +
                " ,aniDomnire= " + aniDomnire +
                " ,soldati= " + soldati +
                "} ";
    }

    public void prezentare() {
        System.out.println("Inchinati-va Majestatii Sale Regelui Arthur");
    }
}
