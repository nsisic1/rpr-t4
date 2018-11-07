package ba.unsa.etf.rpr.tut1;

import java.util.ArrayList;
import java.util.List;

class Predmet {
    private String naziv;
    private int brojECTS;
    private boolean obavezan;
    Semestar semestar;
    // String profesor;

    Predmet(String naziv, int brojECTS, boolean obavezan, String profesor) {}

    void setNaziv() {}
    String getNaziv() {
        return naziv;
    }

    void setBrojECTS() {}
    int getBrojECTS() {
        return brojECTS;
    }

    void setObavezan() {}
    boolean isObavezan() {
        return obavezan;
    }

    List<Student> dajSpisakStudenata() {
        System.out.print(this);
        return Studij.dajStudentePredmeta(this);
    }
}
