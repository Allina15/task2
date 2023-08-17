package FK;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Napadayushiy napadayushiy = new Napadayushiy("Zalkar","M",LocalDate.of(2006,2,12), 175,62);
        Zashitnik zashitnik = new Zashitnik("Bilal","A", LocalDate.of(2005,6,23),170,65);
        Vratar vratar = new Vratar("Zhandar","T",LocalDate.of(2001,9,15),189,80);
        Trener trener = new Trener("Muktar","A");

        napadayushiy.displayInfo();
        System.out.println(napadayushiy.position());

        vratar.displayInfo();
        System.out.println(vratar.position());

        zashitnik.displayInfo();
        System.out.println(zashitnik.position());

        trener.displayInfo();
        System.out.println(trener.position());
    }
}
