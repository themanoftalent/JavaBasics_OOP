import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        // örnek 407  sayisi armstorng sayidir
        System.out.println("sayinizin armstorng sayi olup olmadigini kontrol etmek icin bir sayi giriniz");
        int Number=input.nextInt();
        int Memory=Number;
        int MemoryTwo=Number;
        int Step=0;
        int ArmstrongSum=0;
        while (Memory >0){
            int a=Memory%10;
            Memory=(Memory-a)/10;
            Step++;

        }
        while (MemoryTwo >0){
            int b=MemoryTwo%10;
            MemoryTwo=(MemoryTwo-b)/10;
            ArmstrongSum+=(int)Math.pow(b, Step);

        }
if(ArmstrongSum==Number){
    System.out.println("Sayiniz armstrong sayidir");

}else{
    System.out.println("Sayiniz armstorng sayii degildir");
}

    }
}