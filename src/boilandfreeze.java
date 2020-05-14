import java.util.Scanner;
public class boilandfreeze {

	public static void main(String[] args) {
		    System.out.println("Give in the temperature:");
		Scanner cb = new Scanner(System.in)	;
		int temp = cb.nextInt();
			if (temp >=100) {
			System.out.println("The water is boiling");
		}
			if (temp <= 0) {
			System.out.println("The water is freezing");
		}    if (temp > 0 && temp < 100)
			System.out.println("The water is in a normal state");				
		}
		}
