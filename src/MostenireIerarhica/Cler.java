package MostenireIerarhica;

public class Cler extends OmSimplu{
    private String resedinta;

    public Cler(String nume, String ocupatie, String resedinta) {
        super(nume, ocupatie);
        this.resedinta = resedinta;
    }
    public String getResedinta() {
        return resedinta;
    }

    public void setResedinta(String resedinta) {
        this.resedinta = resedinta;
    }

    @Override
    public String toString() {
        return "Cler{"+
                " nume= " + getNume() +
                " ,ocupatie= " + getOcupatie() +
                " ,resedinta= " + resedinta + '\'' +
                "} ";
    }

    @Override
    public void prezentare(){
        System.out.println("Eu sunt preamaritul cleric John");
    }
}
