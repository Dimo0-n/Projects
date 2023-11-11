package MostenireSimpla;
public class Floare {
    private String simbolism;
    private int petale;
    private String habitat;

    public Floare(String simbolism, int petale, String habitat){
        this.simbolism = simbolism;
        this.petale = petale;
        this.habitat = habitat;
    }
    public String getSimbolism() {
        return simbolism;
    }

    public int getPetale() {
        return petale;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setSimbolism(String simbolism) {
        this.simbolism = simbolism;
    }

    public void setPetale(int petale) {
        this.petale = petale;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Floare{" +
                "simbolism='" + simbolism + '\'' +
                ", petale=" + petale +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
