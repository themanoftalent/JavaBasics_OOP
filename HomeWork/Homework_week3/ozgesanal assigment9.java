//2311502210
//Prime Number Checker

import java.util.Scanner;
public class Asg9{
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a number for prime num test: ");
        int num = prime.nextInt();
        boolean primetest=true;

        if(num==1){
            System.out.println("This number isn't a prime number!");
        }
        else if(num==2){
            System.out.println("This is a prime number!");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    primetest = false;
                }
            }
            if(primetest==false) {
                System.out.println("This number isn't a prime number!");
            }
            else{
                System.out.println("This is a prime number!");
            }
        }
    }
}
