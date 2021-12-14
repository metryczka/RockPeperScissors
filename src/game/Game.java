package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject [] gameObject= {new Rock(), new Paper(), new Scissors()};
	private Scanner scanner = new Scanner(System.in);
	private String [] result = {"lose", "tie", "win"};
	
	public static int totalResult;
	
	public void run() {
		
		Random random = new Random();
		System.out.println("Play!");
		
		for (int i=0; i<3; i++) {
		System.out.println("Choose one of these :");
		System.out.println("0. Rock");
		System.out.println("1. Paper");
		System.out.println("2. Scissors");
		System.out.print("> ");
		int input = scanner.nextInt();
		//1 scanner.close();
		GameObject object1 = gameObject[input];
		System.out.println("You chose " + object1.getName());
		GameObject object2 = gameObject[random.nextInt(gameObject.length)];
		System.out.println("The computer chose " + object2.getName());
		totalResult += object1.compareTo(object2);
		System.out.println(result[object1.compareTo(object2)+1]);
		}
		scanner.close();
		if (totalResult < 0) {
			System.out.println("You have LOSE!");
		}
		else if (totalResult == 0) {
			System.out.println("It's a TIE!");
		}
		else {
			System.out.println("You have WIN!");
		}
	
	}
		
}
