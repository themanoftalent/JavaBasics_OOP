public class Main22 {
		public int yaş = 20;
		public double ortalama= 2.5;
		public char not= 'B';
		public String pass= "not pass";
		public String ev="Bandırma";
}


public class Main23 {

	public static void main(String[] args) {
		Main22 a = new Main22();
		System.out.println("You are "+a.yaş+" years old.");
		System.out.println("Your point avarage is "+a.ortalama);
		System.out.println("Your grade is "+a.not);
		System.out.println("You did "+a.pass+" the exam.");
		System.out.println("You are live in "+a.ev);

	}

}
