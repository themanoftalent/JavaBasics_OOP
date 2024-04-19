import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int sayma=0;
        int kelimesayisi=0;
        System.out.println("kelime aratmak istediginiz cumleyi giriniz");
        String cumle =input.nextLine();
       System.out.println("aramak istediginiz kelimeyi giriniz");
       String AranacakKelime=input.nextLine();
       for(int a=0;a<cumle.length()-AranacakKelime.length()+1;a++){
           for(int b=0;b<AranacakKelime.length();b++){
               if(cumle.charAt(a+b)==AranacakKelime.charAt(b)){
                   sayma++;
               }
               else{
                   break;
               }
           }
           if(sayma==AranacakKelime.length()){
               System.out.println("aradıgınız kelime "+(a+1)+" ile" +(a+AranacakKelime.length())+" arasında");
               sayma=0;
               kelimesayisi++;
           }
           else {
               sayma=0;
           }
       }

if(kelimesayisi==0){
    System.out.println( "aradiginiz kelime bu cumlede yoktur");
}


    }
}