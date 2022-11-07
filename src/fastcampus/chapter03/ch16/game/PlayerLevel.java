package fastcampus.chapter03.ch16.game;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : PlayerLevel
 * user : jwlee
 * date : 2022/11/05
 */
public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    void go(int count) {
        run();
        for (int i=0; i<count; i++) {
            jump();
        }
        turn();
    }

}
