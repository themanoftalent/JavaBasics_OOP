public class Main26 {

	public static void main(String[] args) {
		System.out.println("The Fibonacci Numbers until 1000: ");
		int i=1;
		int f=0;
		while (f < 1000) 
		{
		i=i+f;
		System.out.println(i);
		f=f+i;
		System.out.println(f);
		}
	}

}
