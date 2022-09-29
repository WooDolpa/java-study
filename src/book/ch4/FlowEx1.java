package book.ch4;

/**
 * packageName : ch4
 * className : FlowEx1
 * user : jwlee
 * date : 2022/09/09
 */
public class FlowEx1 {

    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일때, 참인 것은%n", x);

        if(x==0) System.out.println("x==0");
        if(x != 0) System.out.println("x != 0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x != 0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x+%d 일때, 참인 것은%n", x);

        if(x==0) System.out.println("x==0");
        if(x != 0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
    }
}
