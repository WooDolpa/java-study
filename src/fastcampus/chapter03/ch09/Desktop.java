package fastcampus.chapter03.ch09;

/**
 * packageName : fastcampus.chapter03.ch09
 * className : Desktop
 * user : jwlee
 * date : 2022/10/18
 */
public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
