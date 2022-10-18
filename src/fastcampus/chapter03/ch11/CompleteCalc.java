package fastcampus.chapter03.ch11;

/**
 * packageName : fastcampus.chapter03.ch11
 * className : CompleteCalc
 * user : jwlee
 * date : 2022/10/18
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
}
