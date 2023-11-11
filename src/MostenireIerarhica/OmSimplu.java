package MostenireIerarhica;

public class OmSimplu extends Persoana{
    private String ocupatie;

    public OmSimplu(String nume, String ocupatie) {
        super(nume);
        this.ocupatie = ocupatie;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        return "Om Simplu{" +
                " nume= " + getNume() +
                " ,ocupatie= " + ocupatie + '\'' +
                "} ";
    }

    @Override
    public void prezentare(){
        System.out.println("Sunt cel mai fidel supus");
    }

    //overload
}
