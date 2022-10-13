package fastcampus.chapter03.ch03;

/**
 * packageName : fastcampus.chapter03.ch02
 * className : VIPCustomer
 * user : jwlee
 * date : 2022/10/12
 */

/**
 * 상속은 받은 클래스는 어떻게 상위 클래스를 사용할 수 있을까? -> 상속 받은 하위 클래스에서 생성자를 통해 인스턴스화가 될때 상위 클래스를 생성하기 때문에 사용이 가능하다.
 * 그러면 new 키워드를 사용하지 않고 어떻게 객체 생성이 되었을까? -> 자바 컴파일러가 하위 클래스 생성자에 super(); 를 넣어준다.
 * this -> 생성된 인스턴스 자기 주소를 가지고 있는 기능,
 * super 키워드는 상위 클래스 인스턴스 주소 값을 가진다.
 *
 */
public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;


//    public VIPCustomer() {
//
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer(int, String) call");
    }

    public String getAgentID() {
        return agentID;
    }
}
