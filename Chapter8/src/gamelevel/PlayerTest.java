package gamelevel;

public class PlayerTest {
	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvencedLevel bplayer = new AdvencedLevel();
		player.upgradeLevel(bplayer);
		player.play(2);
		
		SuperLevel splayer = new SuperLevel();
		player.upgradeLevel(splayer);
		player.play(3);
	}
}
