package fastcampus.chapter02.ch18;

/**
 * packageName : fastcampus.ch18
 * className : CarFactoryTest
 * user : jwlee
 * date : 2022/10/10
 */
public class CarFactoryTest {

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }

}
