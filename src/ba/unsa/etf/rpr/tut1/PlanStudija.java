package ba.unsa.etf.rpr.tut1;

import java.util.Map;
import java.util.Set;

 class PlanStudija {
    Map<Integer, Set<Predmet>> semestri; // kako za obavezan

     Set<Predmet> dajSemestar(int redniBroj) {
         return semestri.get(redniBroj);
     }
}
