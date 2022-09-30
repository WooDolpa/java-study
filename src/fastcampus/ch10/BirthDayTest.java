package fastcampus.ch10;

/**
 * packageName : fastcampus.ch10
 * className : BirthDayTest
 * user : jwlee
 * date : 2022/09/30
 */
public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();
        birthDay.setYear(2022);
        birthDay.setMonth(12);
        birthDay.setDay(30);

        birthDay.showDate();
    }

}
