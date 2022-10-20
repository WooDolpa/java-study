package fastcampus.chapter03.ch14;

/**
 * packageName : fastcampus.chapter03.ch14
 * className : Calculator
 * user : jwlee
 * date : 2022/10/20
 */
public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}
