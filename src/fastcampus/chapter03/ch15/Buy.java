package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : Buy
 * user : jwlee
 * date : 2022/10/21
 */
public interface Buy {

    void buy();
    default void order(){
        System.out.println("buy order");
    }

}
