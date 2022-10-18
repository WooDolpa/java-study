package fastcampus.chapter03.ch11;

/**
 * packageName : fastcampus.chapter03.ch11
 * className : Calc
 * user : jwlee
 * date : 2022/10/18
 */
public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add (int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

}
