//2311502210
//Array Sum and Average

public class Asg11{
    public static void main(String[] args){
        int[] array = {5,10,15,20,25};
        int sum=0;

        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        double avarage =(double)sum/(array.length);
        System.out.println("Sum is "+sum+"\nAvarage is "+avarage);
    }
}
