package ba.unsa.etf.rpr.tut1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 class PlanStudija {

     Map<Integer, Set<Predmet>> semestri; // kako za obavezan

     PlanStudija() {
         semestri = new HashMap<>();
     }

     Set<Predmet> dajSemestar(int redniBroj) {
         return semestri.get(redniBroj);
     }

     void dodajSemestar(Set<Predmet> semestar) {
         semestri.put(semestri.size() + 1, semestar);
     }
}
