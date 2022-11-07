package fastcampus.chapter03.ch16.game;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : Player
 * user : jwlee
 * date : 2022-11-07
 */
public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
        this.level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return this.level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        this.level.showLevelMessage();
    }

    public void play(int count){
        this.level.go(count);
    }
}
