package fastcampus.ch14;

/**
 * packageName : fastcampus.ch14
 * className : TakeTransTest
 * user : jwlee
 * date : 2022/10/10
 */
public class TakeTransTest {

    public static void main(String[] args) {

//        Student studentJ = new Student("James", 5000);
//        Student studentT = new Student("Tomas", 10000);
//
//        Bus bus100 = new Bus(100);
//        Bus bus500 = new Bus(500);
//
//        studentJ.takeBus(bus100);
//
//        Subway greenSubway = new Subway(2);
//
//        studentT.takeSubway(greenSubway);
//
//        studentJ.showInfo();
//        studentT.showInfo();
//
//        bus100.showBusInfo();
//        greenSubway.showSubwayInfo();

        Student studentE = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘 간다 운수택시");

        studentE.takeTaxi(taxi);

        studentE.showInfo();
        taxi.showTaxiInfo();
    }
}
