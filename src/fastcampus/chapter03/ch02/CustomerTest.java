package fastcampus.chapter03.ch02;

/**
 * packageName : fastcampus.chapter03.ch02
 * className : CustomerTest
 * user : jwlee
 * date : 2022/10/12
 */
public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
