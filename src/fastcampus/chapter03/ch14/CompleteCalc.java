package fastcampus.chapter03.ch14;

/**
 * packageName : fastcampus.chapter03.ch14
 * className : CompleteCalc
 * user : jwlee
 * date : 2022/10/20
 */
public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0)
            return ERROR;

        return num1/num2;
    }

    public void showInfo() {
        System.out.println("모두 구현되었습니다.");
    }

    @Override
    public void description() {
        System.out.println("CompleteCalc overriding");
    }

}
