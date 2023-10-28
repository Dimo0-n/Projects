package Apprentissage;
class Carte{

    private String denumire;
    private String autor;
    private int anul;
    private String categorie;

    public Carte(String denumire, String autor, int anul, String categorie){
        this.denumire= denumire;
        this.autor = autor;
        this.anul = anul;
        this.categorie = categorie;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnul(int anul) {
        this.anul = anul;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public String getDenumire() {
        return denumire;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnul() {
        return anul;
    }
    public String getCategorie() {
        return categorie;
    }
    @Override
    public String toString() {
        return "Cartea{\n" +
                "\nDenumire = " + denumire +
                "\nAutor = " + autor +
                "\nAnul = " + anul +
                "\nCategorie = " + categorie +
                "\n}";
    }

}