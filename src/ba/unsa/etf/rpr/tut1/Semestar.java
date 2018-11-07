package ba.unsa.etf.rpr.tut1;

import java.util.ArrayList;

class Semestar {
    private int brojSemestra;
    ArrayList<Predmet> obavezniPredmeti;
    ArrayList<Predmet> izborniPredmeti;
    // ArrayList<Student> studenti ?

    void setBrojSemestra() {}
    int getBrojSemestra() {
        return brojSemestra;
    }

    void dodajPredmet(Predmet predmet, boolean obavezan) {}
    void izbaciPredmet() {}
}
