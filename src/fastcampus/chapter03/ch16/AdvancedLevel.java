package fastcampus.chapter03.ch16;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : AdvancedLevel
 * user : jwlee
 * date : 2022/10/28
 */
public class AdvancedLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump 못하지롱");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    public void showLevelMessage() {

    }
}
