//Arda Göktaş 2311502241
public class ArraySumAverageArdaGoktas {
    public static void main(String[] args){
        int array1[] ={10,20,30,40,50,60,70,80,90,100};
        int array2[] ={110,120,130,140,150,160,170,180,190,200};
        int sum1 = 0, average1 = 0, sum2 = 0, average2 = 0;
        for(int i=0; i<array1.length;i++){
            sum1 += array1[i];
            average1 = sum1 / array1.length;
        }
        for(int j=0; j<array2.length; j++){
            sum2 += array2[j];
            average2 = sum2 / array2.length;
        }
        System.out.println("Sum of the numbers in array1 is = "+ sum1 + " The average of the numbers is = "+ average1);
        System.out.println("Sum of the numbers in array2 is = "+ sum2 + " The average of the numbers is = "+ average2);

    }
}
