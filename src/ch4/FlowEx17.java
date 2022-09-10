package ch4;

import java.util.Scanner;

/**
 * packageName : ch4
 * className : FlowEx17
 * user : jwlee
 * date : 2022/09/09
 */
public class FlowEx17 {

    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();            // 화면을 통해 입력받은 내용을 tmp 에 저장
        num = Integer.parseInt(tmp);

        for (int i=0; i<num; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
