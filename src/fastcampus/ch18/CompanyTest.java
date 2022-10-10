package fastcampus.ch18;

/**
 * packageName : fastcampus.ch18
 * className : CompanyTest
 * user : jwlee
 * date : 2022/10/10
 */
public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
    }
}
