package book.ch3;

/**
 * packageName : ch3
 * className : OperatorEx14
 * user : jwlee
 * date : 2022/09/09
 */
public class OperatorEx14 {

    public static void main(String[] args) {

        char c = 'a';
        for (int i=0; i<26; i++) {              // 블럭{} 안에 문장을 26번 반복
            System.out.print(c++);              // 'a' 부터 26개 문자 출력
        }
        System.out.println();       // 줄 바꿈
        c = 'A';
        for (int i=0; i<26; i++) {              // 블럭{} 안에 문장을 26번 반복
            System.out.print(c++);              // 'A' 부터 26개 문자 출력
        }
        System.out.println();       // 줄 바꿈

        c='0';
        for (int i=0; i<10; i++){
            System.out.print(c++);
        }
        System.out.println();
    }
}
