package Week6;

public class YağızZorluPersonalityExampleTests {
    public static void main(String[] args) {
        YağızZorluPersonalityExample personalityExample = new YağızZorluPersonalityExample();

        System.out.println("Yaşım: " + personalityExample.calculateAge(2024,2002));
        System.out.println("Adım: " + personalityExample.name);
        System.out.println("Soyadım: " + personalityExample.surname);
        System.out.println("Okuduğum Üniversite: " + personalityExample.university);
        System.out.println("Okuduğum Bölüm: " + personalityExample.department);
        System.out.println("Saçımın Rengi: " + personalityExample.colorOfHair);
        System.out.println("Boyumun Uzunluğu: " + personalityExample.height);
        System.out.println("Hobim: " + personalityExample.hobby);

        if(personalityExample.doYouHaveBeard) {
            System.out.println("Sakalım var");
        } else {
            System.out.println("Sakalım yok");
        }

        if(personalityExample.doYouHaveMustache) {
            System.out.println("Bıyığım var");
        } else {
            System.out.println("Bıyığım yok");
        }
    }
}
