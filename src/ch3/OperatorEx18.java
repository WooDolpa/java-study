package ch3;

/**
 * packageName : ch3
 * className : OperatorEx18
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx18 {

    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

        // Math.round(3.141592 * 1000) / 1000.0
        // Math.round(3141.592) / 1000.0
        // 3142 / 1000.0
        // 3.142
    }
}
