package book.ch2;

/**
 * packageName : ch2
 * className : CharToCode
 * user : jwlee
 * date : 2022/09/06
 */
public class CharToCode {

    public static void main(String[] args) {
        char ch = 'A';          // char ch = 65;
        int code = (int)ch;     // ch 에 저장된 값을 int 타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
