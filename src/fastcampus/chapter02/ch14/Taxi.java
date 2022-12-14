package fastcampus.chapter02.ch14;

/**
 * packageName : fastcampus.ch14
 * className : Taxi
 * user : jwlee
 * date : 2022/10/10
 */
public class Taxi {

    String taxiName;
    int money;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showTaxiInfo() {
        System.out.println(taxiName + " 수입은 " + money + "입니다.");
    }

}
