import java.time.Period;
import java.time.LocalDate;
public class SerkanOneFile {
    public String name;
    public String surname;
    public String univ;
    public String dept;
    public String HairColor;
    public double height;
    public double weight;
    public String hobby;
    public boolean hasMustache;
    public boolean hasBeard;
    public LocalDate birthdate;

    public SerkanOneFile(String name,String surname, String univ, String dept, String HairColor, double height, double weight, String hobby, boolean hasMustache, boolean hasBeard, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.univ = univ;
        this.dept = dept;
        this.HairColor = HairColor;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.hasMustache = hasMustache;
        this.hasBeard = hasBeard;
        this.birthdate = birthdate;
    }

    // Metot
    public int calculateAge(){

        LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate,now);
        return period.getYears();
    }

    public static void main(String[] args) {
        Serkan adam = new Serkan("Serkan", "Kaya", "Bandirma", "Comeng", "white", 174.20, 100.2, "reading", true, false, LocalDate.of(1990, 5, 5));

        System.out.println("Name: " + adam.name);
        System.out.println("Surname: " + adam.surname);
        System.out.println("University: " + adam.univ);
        System.out.println("Department: " + adam.dept);
        System.out.println("Hair Color: " + adam.HairColor);
        System.out.println("Height: " + adam.height);
        System.out.println("Weight: " + adam.weight);
        System.out.println("Hobby: " + adam.hobby);
        System.out.println("Has Mustache: " + adam.hasMustache);
        System.out.println("Has Beard: " + adam.hasBeard);
        System.out.println("Birthdate: " + adam.birthdate);
        System.out.println("Age: " + adam.calculateAge());
    }
}


}

