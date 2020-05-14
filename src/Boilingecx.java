import java.util.Scanner;
public class Boilingecx {

	public static void main(String[] args) {
		System.out.println("Give in the temperature:");
		Scanner cb = new Scanner(System.in)	;
		int temp = cb.nextInt();
		if (temp >=100) {
			System.out.println("The water is boiling");
		}	else {
			System.out.println("The water is not boiling");
		}
	}

}
