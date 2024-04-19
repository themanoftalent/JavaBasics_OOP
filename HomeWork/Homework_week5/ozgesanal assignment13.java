//2311502210
//Linear Search

public class Asg13 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int target = 15;
        boolean search = false;

        for (int i=0; i<array.length; i++) {
            if (array[i] == target) {
                search = true;
                break;
            }
        }
        if (search) {
            System.out.println("Target found! : "+target);
        } else {
            System.out.println("Target not found!");
        }
    }
}
