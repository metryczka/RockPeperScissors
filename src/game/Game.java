package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject [] gameObject= {new Scissors(), new Rock(), new Paper()};
	
	public void run() {
		
		Random random = new Random();
		System.out.println("Play!");
		
		GameObject object1 = gameObject[random.nextInt(gameObject.length)];
		GameObject object2 = gameObject[random.nextInt(gameObject.length)];
		System.out.println(object1 + "obj1");
		System.out.println(object2 + "obj2");

		System.out.println(object1.compareTo(object2));
		
		
	}
}
