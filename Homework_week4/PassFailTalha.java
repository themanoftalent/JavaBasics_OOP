import java.util.*;
public class PassFailTalha {

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        float grade1, grade2, grade3, grade4, grade5, gpa;

        System.out.println("Enter your first grade:");
        grade1 = input.nextFloat();

        System.out.println("Enter your second grade:");
        grade2 = input.nextFloat();

        System.out.println("Enter your third grade:");
        grade3 = input.nextFloat();

        System.out.println("Enter your fourth grade:");
        grade4 = input.nextFloat();

        System.out.println("Enter your fifth grade:");
        grade5 = input.nextFloat();

        gpa = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        int result = 0;

        if (gpa >= 50)
            result = 1;

        switch (result){

            case 1:
                System.out.println("You passed!");
                break;

            case 0:
                System.out.println("You failed!");
                break;
        }

    }


}