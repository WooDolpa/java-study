package fastcampus.ch18;

/**
 * packageName : fastcampus.ch18
 * className : Car
 * user : jwlee
 * date : 2022/10/10
 */
public class Car {

    private static int serialNum = 10000;
    int carNum;

    public Car() {
        serialNum++;
        this.carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
