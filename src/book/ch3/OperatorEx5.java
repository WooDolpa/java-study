package book.ch3;

/**
 * packageName : ch3
 * className : OperatorEx5
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b);
    }

}
