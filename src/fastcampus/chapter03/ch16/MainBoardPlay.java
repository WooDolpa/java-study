package fastcampus.chapter03.ch16;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : MainBoardPlay
 * user : jwlee
 * date : 2022-11-07
 */
public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

    }

}
