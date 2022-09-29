package book.ch3;

/**
 * packageName : ch3
 * className : OperatorEx10
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx10 {

    public static void main(String[] args) {

        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }

}
