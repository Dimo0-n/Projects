package MostenireSimpla;
public class Trandafir extends Floare{
    private boolean spini;
    private String culoare;

    public Trandafir(String simbolism, int petale, String habitat, String culoare, boolean spini) {
        super(simbolism, petale, habitat);
        this.culoare = culoare;
        this.spini = spini;
    }
    public boolean isSpini() {
        return spini;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setSpini(boolean spini) {
        this.spini = spini;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Trandafir{" +
                "spini=" + spini +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
