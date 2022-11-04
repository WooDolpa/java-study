package fastcampus.chapter03.ch16;

import java.util.stream.IntStream;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : PlayerLevel
 * user : jwlee
 * date : 2022/10/27
 */
public interface PlayerLevel {

    public void run();
    public void jump();
    public void turn();
    public void showLevelMessage();

    default void go(int count) {
        run();
        for (int i=0; i<count; i++){
            jump();
        }
        turn();
    }
}
