package ba.unsa.etf.rpr.tut1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;



class FakultetTest {

    @Test
    void dajStudente(){

        Fakultet faks = new Fakultet();
        Predmet p1 = new Predmet("DM", 15, true);
        Predmet p2 = new Predmet("Bosanski", 15, true);
        Fakultet.dodajPredmet(p1);
        Fakultet.dodajPredmet(p2);

        Set<Predmet> predmeti = new HashSet<Predmet>();
        predmeti.add(p1);
        predmeti.add(p2);

        PlanStudija ps = new PlanStudija();
        ps.dodajSemestar(predmeti);

        Student s1 = new Student("Osman", 12345);
        Student s2 = new Student("Ipe", 44444);

        Fakultet.dodajStudenta(s1);
        Fakultet.dodajStudenta(s2);

        Fakultet.upisiStudentaUSemestar(s1, ps, 1);
        Fakultet.upisiStudentaUSemestar(s2, ps, 1);

        assertEquals(p1.dajUpisaneStudente(), "Ipe\nOsman\n");



    }


}