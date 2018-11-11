package ba.unsa.etf.rpr.tut1;

class Upis {

    private Student student;
    private Predmet predmet;
    private PlanStudija planStudija;

    Upis(Student student, Predmet predmet, PlanStudija planStudija) {
        this.setStudent(student);
        this.setPredmet(predmet);
        this.setPlanStudija(planStudija);
    }

    Student getStudent() {
        return student;
    }

    void setStudent(Student student) {
        this.student = student;
    }

    Predmet getPredmet() {
        return predmet;
    }

    void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    PlanStudija getPlanStudija() {
        return planStudija;
    }

    void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Upis) {
            Upis u = (Upis) o;
            return (getStudent() == u.getStudent() && getPredmet() == u.getPredmet() &&
                getPlanStudija() == u.getPlanStudija());
        } else {
            return false;
        }

    }
}
