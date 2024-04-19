public class linearSearch {
    public static void main(String[] args) {
        int [] dizi= {2,3,4,5,6,79,54,23};
        int aranan =5;

        for(int i=0;i< dizi.length;i++) {

           if(dizi[i]==aranan){
              aranan=i;
               break;
           }
        }
        if(aranan!=5){
            System.out.println("Aranan eleman dizide var");
        }
        else
        {
            System.out.println("Aranan eleman bulunamadı");
        }
    }
}//CEYDA ANKARA
