import java.util.Scanner;

public class tut3 {

	public static void main(String[] args) {
		System.out.println("Give in the celsius value");
		Scanner cf= new Scanner(System.in);
		double celsius = cf.nextDouble();
		double fahrenheit = 9/5 * celsius + 32;
		System.out.println("Fahrenheit:  "+fahrenheit);
		
	}

}
