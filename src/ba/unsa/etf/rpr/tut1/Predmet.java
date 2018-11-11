package ba.unsa.etf.rpr.tut1;

public class Predmet {

    private String naziv;
    private int brojECTS;
    private boolean obavezan;

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
}
