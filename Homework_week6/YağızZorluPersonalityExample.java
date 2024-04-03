package Week6;

public class YağızZorluPersonalityExample {
    public String name = "Yağız";
    public String surname = "Zorlu";

    public int currentYear;

    public int birthYear;
    public String university = "Bandırma Onyedi Eylül Üniversitesi";
    public String department = "Bilgisayar Mühendisliği";
    public String colorOfHair = "Siyah";
    public double height = 1.78;
    public boolean doYouHaveMustache = true;
    public boolean doYouHaveBeard = true;
    public String hobby = "Masa tenisi oynamak";

    public int calculateAge(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        return age;
    }
}
