import java.time.Period;
import java.time.LocalDate;
public class Main24 {
	
	public LocalDate bugun= LocalDate.now();
	public LocalDate doğumtarihi= LocalDate.of(2003, 8, 21);
	Period fark = Period.between(doğumtarihi, bugun);
	public int getYears() {
        return fark.getYears();
    }

    public int getMonths() {
        return fark.getMonths();
    }

    public int getDays() {
        return fark.getDays();
    }
	
}
public class Main25 {

	public static void main(String[] args) {
		Main24 a= new Main24();
		
		
		
		System.out.println(a.getYears()+" year, "+a.getMonths()+" months, "+a.getDays()+" days.");

	}

}
