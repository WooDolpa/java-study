package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : BookShelfTest
 * user : jwlee
 * date : 2022/11/02
 */
public class BookShelfTest {

    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("토지1");
        bookQueue.enQueue("토지2");
        bookQueue.enQueue("토지3");
        bookQueue.enQueue("토지4");
        bookQueue.enQueue("토지5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }

}
