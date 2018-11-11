package ba.unsa.etf.rpr.tut1;

class Student {

    private String imeIPrezime;
    private int brojIndeksa;
    private int brojECTS;

    Student(String imeIP, int indeks) {
        imeIPrezime = imeIP;
        brojECTS = indeks;
    }

    String getImeIPrezime() {
        return imeIPrezime;
    }

    void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    int getBrojIndeksa() {
        return brojIndeksa;
    }

    void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    void upisiSemestar(int brojSemestra) {

    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }

    @Override
    public String toString() {
        return imeIPrezime;
    }
}
