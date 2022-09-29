package book.ch3;

/**
 * packageName : ch3
 * className : OperatorEx8
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx8 {

    public static void main(String[] args) {
        int a = 1_000_000;          // 1,000,000  1백만
        int b = 2_000_000;          // 2,000,000  2백만

        long c = a * b;             // a * b = 2,000,000,000,000 ?
        System.out.println(c);

        // 두 피연산자 타입이 int 형이므로 연산 결과도 int 타입이여서 전혀 다른값으로 나온다.
        // 따라서 둘중 하나를 long 타입으로 바꿔야 한다.

        c = (long)a * b;
        System.out.println(c);
    }

}
