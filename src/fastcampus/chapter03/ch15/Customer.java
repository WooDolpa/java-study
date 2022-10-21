package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : Customer
 * user : jwlee
 * date : 2022/10/21
 */
public class Customer implements Buy,Sell{

    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    public void hello() {
        System.out.println("hello");
    }
}
