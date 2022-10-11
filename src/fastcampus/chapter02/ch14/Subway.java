package fastcampus.chapter02.ch14;

/**
 * packageName : fastcampus.ch14
 * className : Subway
 * user : jwlee
 * date : 2022/10/10
 */
public class Subway {

    int subWayNumber;
    int passengerCount;
    int money;

    public Subway(int subWayNumber) {
        this.subWayNumber = subWayNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subWayNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money +"원 입니다.");
    }

}
