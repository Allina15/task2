package FK;

import java.time.LocalDate;
import java.time.Period;
    abstract class Sportsman {
        private String firstName;
        private String lastName;
        private int age;
        private double height;
        private double weight;

        public Sportsman(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = Period.between(birthDate, LocalDate.now()).getYears();
            this.height = height;
            this.weight = weight;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
        public abstract void displayInfo();
    }
