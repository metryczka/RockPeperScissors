package game;

import java.util.Random;
import java.util.Scanner;


public class Game {
	
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private GameObject[] objects = GameObject.values();
	public static int totalResult;
	
	public void run() {
		
		
		System.out.println("Play!");
		
		for (int i=0; i<3; i++) {
		GameObject playerObject = userInput();
		GameObject randomObject = randomObject();
		System.out.println();
		System.out.println(playerObject + "--" + randomObject);
		
		if (playerObject.beats(randomObject)) {
			System.out.println("win");
			System.out.println(playerObject+ "beats" + randomObject);
			totalResult +=1;
		}
		else if (playerObject == randomObject) {
			System.out.println("tie");
			
		}
		
		else {
			System.out.println("loose");
			totalResult -=1;
			System.out.println(randomObject+ "beats" + playerObject);
		}

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
	
	public GameObject userInput() {
		boolean getNumber = false;
		int number = -1;
		
		do {
		do {
		System.out.println("Choose one of these:");
		System.out.println("0. Rock");
		System.out.println("1. Paper");
		System.out.println("2. Scissors");
		System.out.print("> ");
		String input = scanner.nextLine();
		
		try {
			number = Integer.parseInt(input);
			getNumber = true;
		}
		catch(NumberFormatException e) {
			System.out.println("Give a valid input!");
		}
		}
		while(!getNumber);
		
		if (number < 3 && number >=0) {
			return objects[number];
		}
		else {}
		System.out.println("Not valid number!");
		}while(true);
		
		
		
		
	}
	
	public GameObject randomObject() {
		return objects[random.nextInt(objects.length)];
	}
	

}
