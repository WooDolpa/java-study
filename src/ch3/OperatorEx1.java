package ch3;

/**
 * packageName : ch3
 * className : OperatorEx1
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx1 {

    public static void main(String[] args) {
        int i = 5;
        i++;                    // i = i + 1; 과 같은 의미이다. ++i 로 변경해도 결과는 같다.
        System.out.println(i);
        i = 5;                  // 값을 비교하기 위해 다시 5로 변경
        ++i;
        System.out.println(i);
    }

}
