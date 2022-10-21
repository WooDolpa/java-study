package fastcampus.chapter03.ch15;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : CustomerTest
 * user : jwlee
 * date : 2022/10/21
 */
public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.hello();
        customer.order();
        customer.sell();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }

}
