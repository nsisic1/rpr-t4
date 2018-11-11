package ba.unsa.etf.rpr.tut1;

import java.util.HashSet;
import java.util.Set;

public class Fakultet { // TODO sve staticko? - main metoda
    static private Set<Predmet> predmeti = new HashSet<Predmet>();
    static private Set<Student> upisani = new HashSet<Student>();;
    static private Set<Upis> upisi = new HashSet<Upis>();;

    static void dodajStudenta(Student student) {
        upisani.add(student);
    }

    static void dodajPredmet(Predmet predmet) { predmeti.add(predmet);}

    static void upisiStudentaUSemestar(Student student, PlanStudija planStudija, int brojSemestra) {
        Set<Predmet> predmeti = planStudija.dajSemestar(brojSemestra);
        for (Predmet p : predmeti) {
            if (p.isObavezan()) {
                Upis noviUpis = new Upis(student, p, planStudija);
                upisi.add(noviUpis);
                student.setBrojECTS(student.getBrojECTS() + p.getBrojECTS());
            }
        }
        // izaberite izborne : mora barem 30 ECTS
    }

    static Set<Student> dajStudentePredmeta(Predmet predmet) {
        Set<Student> upisaniStudenti = new HashSet<Student>();
        for (Upis u : upisi) {
            if (u.getPredmet() == predmet) {
                upisaniStudenti.add(u.getStudent());
            }
        }
        return upisaniStudenti;
    }
}
