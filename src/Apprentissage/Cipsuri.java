package Apprentissage;
public class Cipsuri {
    private String Denumire;
    private int grame;
    private String gust;
    private String reducere;

    public Cipsuri(String Denumire, int grame, String gust, String reducere){
        this.Denumire = Denumire;
        this.grame  = grame;
        this.gust = gust;
        this.reducere = reducere;
    }
    public void setDenumire(String denumire) {
        Denumire = denumire;
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
        return Denumire;
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
        return "Cipsurile " + Denumire + " de " + grame + " cu gust de " + gust + " " +reducere;
    }
}
