package fastcampus.chapter03.ch04;

/**
 * packageName : fastcampus.chapter03.ch02
 * className : CustomerTest
 * user : jwlee
 * date : 2022/10/12
 */
public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        // 가상 메서드 방식
        Customer vc = new VIPCustomer(12345, "noname");
        vc.calcPrice(10000);
        System.out.println(vc.calcPrice(1000));
    }
}
