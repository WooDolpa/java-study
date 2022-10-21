package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : Cell
 * user : jwlee
 * date : 2022/10/21
 */
public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell order");
    }

}
