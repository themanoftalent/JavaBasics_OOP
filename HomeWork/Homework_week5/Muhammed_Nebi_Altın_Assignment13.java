import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment13 {

    static int indexOf(int[] A, int value){
        for (int i = 0; i < A.length; i++){
            if (A[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,5,1,7,3,7,2,9};

        System.out.println("İndisini bulmak istediğiniz değeri giriniz");
        int num = sc.nextInt();

        int i = indexOf(arr, num);
        if (i != -1)
            System.out.println(num + " Değerinin indisi " + i);
        else
            System.out.println(num + " Değeri dizide yok");
    }
}
