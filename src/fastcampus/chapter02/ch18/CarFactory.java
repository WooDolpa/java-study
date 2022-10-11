package fastcampus.chapter02.ch18;

/**
 * packageName : fastcampus.ch18
 * className : CarFactory
 * user : jwlee
 * date : 2022/10/10
 */
public class CarFactory {

    private static CarFactory instance = new CarFactory();
    private CarFactory(){}

    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}
