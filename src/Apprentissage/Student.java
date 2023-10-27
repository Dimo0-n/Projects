package Apprentissage;
class Student{

    private String nume;
    private String prenume;
    private int varsta;
    private String grupa;

    public Student(String nume, String prenume, int varsta, String grupa){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.grupa = grupa;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public int getVarsta() {
        return varsta;
    }
    public String getGrupa() {
        return grupa;
    }
    @Override
    public String toString() {
        return "Studentul " + nume + " " + prenume + " are varsta de " + varsta + " ani si este din grupa " + grupa;
    }

}