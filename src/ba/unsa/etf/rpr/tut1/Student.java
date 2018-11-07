package ba.unsa.etf.rpr.tut1;

class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private LicniSemestar semestar;

    Student(String ime, String prezime, int indeks) {}

    String getIme() {
        return ime;
    }
    void setIme(String ime) {}

    String getPrezime() {
        return prezime;
    }
    void setPrezime(String prezime) {}

    int getBrojIndeksa() {
        return brojIndeksa;
    }
    void setBrojIndeksa(int brojIndeksa) {}



    void upisi(Predmet predmet) {}
    void ispisi(Predmet predmet) {}
    void upisiNoviSemestar() {}
    void zavrsiStudij() {}
}
