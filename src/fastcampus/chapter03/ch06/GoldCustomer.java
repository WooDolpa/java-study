package fastcampus.chapter03.ch06;

/**
 * packageName : fastcampus.chapter03.ch06
 * className : GoldCustomer
 * user : jwlee
 * date : 2022/10/15
 */
public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
