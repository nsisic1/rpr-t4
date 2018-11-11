package ba.unsa.etf.rpr.tut1;

import java.util.Set;

class Predmet {

    private String naziv;
    private int brojECTS;
    private boolean obavezan;

    Predmet(String naziv, int brojECTS, boolean obavezan) {
        setNaziv(naziv);
        setBrojECTS(brojECTS);
        setObavezan(obavezan);
    }

     String getNaziv() {
        return naziv;
    }

     void setNaziv(String naziv) {
        this.naziv = naziv;
    }

     int getBrojECTS() {
        return brojECTS;
    }

     void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }

    boolean isObavezan() {
        return obavezan;
    }

    void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    Set<Student> dajUpisaneStudente() {
        // poziva iz fakultet (staticki?)?
        return Fakultet.dajStudentePredmeta(this);
    }
}
