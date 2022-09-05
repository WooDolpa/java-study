package ch2;

/**
 * packageName : ch2
 * className : VarEx
 * user : jwlee
 * date : 2022/09/05
 */
public class VarEx {

    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;      // 변수 age 의 값에 2000 을 더해서 변수 year 에 저장
        age = age + 1;          // 변수 age 에 저장된 값을 1 증가시킨다.

        System.out.println(year);
        System.out.println(age);
    }

}
