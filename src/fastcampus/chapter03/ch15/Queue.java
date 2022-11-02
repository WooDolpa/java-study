package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : Queue
 * user : jwlee
 * date : 2022/11/02
 */
public interface Queue {

    void enQueue(String title);
    String deQueue();
    int getSize();
}
