package MostenireIerarhica;

abstract class Persoana {
    private String nume;

    public Persoana(String nume){
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public abstract void prezentare();

    //overload  ls nivel de compilare
    public String Interact(){
        return "Eu ma supun tuturor";
    }

    public String Interact(Persoana p4){
        return "Eu ma inchin doar lui Dumnezeu si regelui meu " + p4.getNume();
    }

    public String Interact(Persoana p1, Persoana p4){
        return "Sunt dator supusului meu " + p1.getNume() + " si Regelui meu " + p4.getNume();
    }

    public String Interact(Persoana p1, Persoana p2, Persoana p3){
        return "Sunt rege datorita supusului meu " + p1.getNume() + ", clerului meu fidel " + p2.getNume() + " si prietenului meu " + p3.getNume();
    }

}
