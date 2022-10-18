package fastcampus.chapter03.ch10;

/**
 * packageName : fastcampus.chapter03.ch10
 * className : CarTest
 * user : jwlee
 * date : 2022/10/18
 */
public class CarTest {

    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("====================");

        Car manualCar = new ManualCar();
        manualCar.run();

    }

}
