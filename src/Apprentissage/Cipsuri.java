package Apprentissage;
public class Cipsuri {
    private String denumire;
    private int grame;
    private String gust;
    private String reducere;

    public Cipsuri(String denumire, int grame, String gust, String reducere){
        this.denumire = denumire;
        this.grame  = grame;
        this.gust = gust;
        this.reducere = reducere;
    }
    public void setDenumire(String denumire) {
        denumire = denumire;
    }
    public void setGrame(int grame) {
        this.grame = grame;
    }
    public void setGust(String gust) {
        this.gust = gust;
    }
    public void setReducere(String reducere) {
        this.reducere = reducere;
    }
    public String getDenumire() {
        return denumire;
    }
    public int getGrame() {
        return grame;
    }
    public String getGust() {
        return gust;
    }
    public String getReducere() {
        return reducere;
    }
    @Override
    public String toString(){
        return "Cipsurile " + denumire + " de " + grame + " cu gust de " + gust + " " +reducere;
    }
}
