import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("What you are about to play will make Bethesda hang their heads");
		System.out.println("Imagine you are in a world of infinite possibilities");
		System.out.println("You are a lone wanderer who acquired the Marauders Map");
		System.out.println("You know... The one from Harry Potter");
		System.out.println("or if you're more of a gamer you get a waypoint");
		System.out.println("You mission should you choose to accept it is...");
		System.out.println("Get to Objective..");
		System.out.println("Yes... Just that... Who knows it could be something awesome");
		System.out.println("So what kind of challenge are you up to?");
		System.out.println("Baby mode input 3 but if you fancy a real challenge push the boat out try 100!");
		
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("So How big is the Map?");
		
		int mapSize = sc.nextInt();
		System.out.println("ooooooo Impressive");
		System.out.println("So here is your Map... Now get to the objective!");
		
		Map m1 = new Map(mapSize,mapSize);
		Player p1 = new Player("Player1");
		Objective o1 = new Objective("Obj1");
					
		m1.addPlayer(p1,mapSize);
		m1.addObj(o1,mapSize);
		m1.showMap();
		
		while (m1.isGameWon()==false) {
		System.out.println("Which Way?");
		String d1 = sc.next();
		m1.move(d1);
		m1.showMap();
		m1.checkWin();
		
		if (m1.isGameWon()==true)
			break;
		}
		
		System.out.println("Rate this game out of 10");
		int rate = sc.nextInt();
		
		if (rate<10) {
			System.out.println("Sorry I didnt quite catch that");
			System.out.println("Please Enter again");
			int rate1 = sc.nextInt();
		}
		else
			System.out.println("Thanks for playing!");
		System.out.println("Sorry");
		}
		
		
	

	}


