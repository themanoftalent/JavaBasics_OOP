package Week6;

public class YağızZorluPersonalityExampleOneFile {
    public String name;
    public String surname;

    public int currentYear;

    public int birthYear;
    public String university;
    public String department;
    public String colorOfHair;
    public double height;
    public boolean doYouHaveMustache;
    public boolean doYouHaveBeard;
    public String hobby;

    public YağızZorluPersonalityExampleOneFile(String name,String surname,String university,String department,
                                               String colorOfHair,double height, boolean doYouHaveBeard,
                                               boolean doYouHaveMustache) {       // Bu constructor. Nesne yenilendiğinde ilk burasının içi çalışır.
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.department = department;
        this.height = height;
        this.doYouHaveBeard = doYouHaveBeard;
        this.doYouHaveMustache = doYouHaveMustache;
        this.hobby = hobby;
        this.colorOfHair = colorOfHair;
    }

    public static void main(String[] args) {
        YağızZorluPersonalityExampleOneFile oneFile = new YağızZorluPersonalityExampleOneFile("Yağız", "Zorlu",
                "Bandırma Onyedi Eylül Üniversitesi","Bilgisayar Mühendisliği", "Siyah", 1.78, true,
                true);
    }
}
