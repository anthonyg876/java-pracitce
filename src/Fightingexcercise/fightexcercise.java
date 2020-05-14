package Fightingexcercise;
import java.util.Scanner;
import java.util.Random;
public class fightexcercise {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("Attack points of the monster:");
		int monsterAttack = sc.nextInt();
			System.out.println("Defense points of the Monster:");
		int monsterDefense = sc.nextInt();
			System.out.println("Damage of Monster:");
		int monsterDamage = sc.nextInt();
			System.out.println("hp of the Monster:");
		int hpMonster = sc.nextInt();
			System.out.println("my Attack points:");
		int myAttack = sc.nextInt();
			System.out.println("my defense points:");
		int myDefense = sc.nextInt();
			System.out.println("my Damage:");
		int myDamage = sc.nextInt();
			System.out.println("my Hp:");
		int myHp = sc.nextInt();
	
		Random generator = new Random();
		boolean attacker = generator.nextBoolean();
		if (attacker) {
			System.out.println("I attack");
			int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
			
			
			
			
		}
		

	}

}
