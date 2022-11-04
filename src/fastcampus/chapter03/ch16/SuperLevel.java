package fastcampus.chapter03.ch16;

/**
 * packageName : fastcampus.chapter03.ch16
 * className : SuperLevel
 * user : jwlee
 * date : 2022/10/28
 */
public class SuperLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 합니다.");
    }

    @Override
    public void showLevelMessage() {
    }
}
