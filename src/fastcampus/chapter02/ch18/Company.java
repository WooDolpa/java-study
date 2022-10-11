package fastcampus.chapter02.ch18;

/**
 * packageName : fastcampus.ch18
 * className : Company
 * user : jwlee
 * date : 2022/10/10
 */
public class Company {

    private static Company instance = new Company();

    private Company() {

    }

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return  instance;
    }

}
