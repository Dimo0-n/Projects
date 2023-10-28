package Apprentissage;

public class Masina {
    private String Marca;
    private String Culoare;
    private int an;
    private int pret;

    public Masina(String Marca, String Culoare, int an, int pret) {
        this.Marca = Marca;
        this.Culoare = Culoare;
        this.an = an;
        this.pret = pret;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public void setCuloare(String Culoare) {
        this.Culoare = Culoare;
    }
    public void setAn(int an) {
        this.an = an;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }
    public String getMarca() {
        return Marca;
    }
    public String getCuloare() {
        return Culoare;
    }
    public int getAn() {
        return an;
    }
    public int getPret() {
        return pret;
    }
    @Override
    public String toString() {
        return "Masina{\n" +
                "\nMarca = " + Marca +
                "\nCuloare = " + Culoare +
                "\nAnul = " + an +
                "\nPretul = " + pret +
                "\n}";
    }
}
