
    public class Main {

        public static void main(String[] args) {

            int num1=10;
            int num2=2;
            int sum;
            int substrac;
            int divis;
            int mutipli;
            int remaind;

            sum = num1 + num2;
            substrac = num1 - num2;
            divis = num1 / num2;
            mutipli = num1 * num2;
            remaind = num1 % num2;

            System.out.println("sum:" +sum);
            System.out.println("substraction :" +substrac);
            System.out.println("division :"+divis);
            System.out.println("multiplication:" +mutipli);
            System.out.println("remainder :" +remaind);


        }
    }

    Scanner scanner=new Scanner(System.in);
    String name;
        System.out.println("enter your name");
    name=scanner.next();
    String surname;
        System.out.println("enter your surname");
    surname=scanner.next();
        System.out.println("the name is "+ name + " the surname is "+ surname);

    }
            }
            import.java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            String name;
            System.out.println("enter your name");
            name=scanner.next();
            name = scanner.next();
            String surname;
            System.out.println("enter your surname");
            surname=scanner.next();
            System.out.println("the name is "+ name + " the surname is "+ surname);

            surname = scanner.next();
            if (name.equals("cedric") && surname.equals("diffo")) {
                System.out.println("your name and surname are correct");
            }
            else {
                System.out.println("Your name and surname are incorrect");
            }
        }
    }