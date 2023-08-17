package FK;

import java.time.LocalDate;
import java.time.Period;

public class Vratar extends Sportsman implements Igrok{

    public Vratar(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
        super(firstName, lastName, birthDate, height, weight);
    }


    @Override
    public String position() {
        return "position goalkeeper";
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getFirstName());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
    }
}
