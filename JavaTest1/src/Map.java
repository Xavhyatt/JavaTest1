import java.util.Arrays;
import java.util.Random;

public class Map extends GameObj {
	
	private GameObj map [][];
	private GameObj playerPos;
	private GameObj objPos;
	private int x;
	private int y;
	private int xObj;
	private int yObj;
	private boolean gameWon;
	
	
	public Map(int width, int length) {
		map = new GameObj[width][length];
		
	}
	
	
	void addPlayer(Player player, int place) {
		Random Rand = new Random();
		int x = (Rand.nextInt(place));
		int y = (Rand.nextInt(place));
		map[x][y] = player;
		this.playerPos = map[x][y];
		this.x = x;
		this.y = y;
		this.gameWon=false;
		
		
//		System.out.println(playerPos);
//		
	}
	public boolean isGameWon() {
		return gameWon;
	}


	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}


	void addObj(Objective obj, int place) {
		Random Rand = new Random();
		int x1 = (Rand.nextInt(place));
		int y1 = (Rand.nextInt(place));
		if(x1==x & y1 == y) {
			addObj(obj, y1);
					}
		else
			map[x1][y1] = obj;
			this.objPos = map[x1][y1];
			this.xObj = x1;
			this.yObj = y1;
			
			
	}
	
	void showMap() {
		for (int i = 0 ; i < map.length ; i++) {
			
			for ( int j = 0 ; j<map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void move(String direction) {
		
		String dir = direction;
		
		
		if (dir.equals("North")) {
			this.map[x][y] = null;
			this.map[x-1][y] = playerPos;
			this.playerPos = map[x][y];
			this.x = this.x -1;
			System.out.println("Is that map working properly?");
			
				
			if(x==xObj & y==yObj) {
				this.gameWon=true;
				System.out.println("You win");
				System.out.println("You won the best game ever");
				
			}
		}
		if (dir.equals("East")) {
			this.map[x][y] = null;
			this.map[x][y+1] = playerPos;
			this.playerPos = map[x][y];
			this.y = this.y +1;
			System.out.println("Be pretty awkward if the map stop wroking huh?");
						
			
			if(x==xObj & y==yObj) {
				this.gameWon=true;
				System.out.println("You win");
				System.out.println("You won the best game ever");
			
			}
		}
		if (dir.equals("South")) {
			this.map[x][y] = null;
			this.map[x+1][y] = playerPos;
			this.playerPos = map[x][y];
			this.x = this.x +1;
			System.out.println("Do you believe in life after love.... *hummm* Sorry just passing the time");
			
			if(x==xObj & y==yObj) {
				this.gameWon=true;
				System.out.println("You win");
				System.out.println("You won the best game ever");
			}
		}
		if (dir.equals("West")) {
			this.map[x][y] = null;
			this.map[x][y-1] = playerPos;
			this.playerPos = map[x][y];
			this.y = this.y -1;
			
			
			if(x==xObj & y==yObj) {
				this.gameWon=true;
				System.out.println("You win");
				System.out.println("You won the best game ever");
			}
			
		}
	}
	
	void checkWin() {
		
		if (playerPos == objPos) {
			this.gameWon=true;
						
		}
	}
			@Override
			public String toString() {
			return "Map [map=" + Arrays.toString(map) + "]";			
			}
		
	}

	
			
		
		
		
			
	
		
	
	
//	@Override
//	public String toString() {
//		return "Map [map=" + Arrays.toString(map) + "]";
//	}
//}
//	
	
	
	
	






//	public void startGame() {
		
		
		

