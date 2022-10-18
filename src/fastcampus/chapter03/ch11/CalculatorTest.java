package fastcampus.chapter03.ch11;

/**
 * packageName : fastcampus.chapter03.ch11
 * className : CalculatorTest
 * user : jwlee
 * date : 2022/10/18
 */
public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.showInfo();
    }
}
