package ba.unsa.etf.rpr.tut1;

import java.util.ArrayList;
import java.util.List;

class Studij {
    private String naziv;
    List<Semestar> semestri;
    List<Student> studenti;

    Studij() {}

    void setNaziv() {}
    String getNaziv() {
        return naziv;
    }

    Semestar dajNtiSemestar(int n) {
        return new Semestar();
    }
    void dodajNoviSemestar(){}
    void izbrisiSemestar(Semestar semestar) {
    }

    static List<Student> dajStudentePredmeta(Predmet predmet) {
        return new ArrayList<Student>();
    }
}
