package FK;

public class Trener implements Igrok{
    private String name;
    private String surName;

    public Trener(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String position() {
        return "position trener";
    }

    @Override
    public void displayInfo() {
        System.out.println("Name "+name);
        System.out.println("SurNAme "+surName);
    }
}
