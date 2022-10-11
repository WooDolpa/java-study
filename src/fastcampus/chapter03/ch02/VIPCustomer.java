package fastcampus.chapter03.ch02;

/**
 * packageName : fastcampus.chapter03.ch02
 * className : VIPCustomer
 * user : jwlee
 * date : 2022/10/12
 */
public class VIPCustomer extends Customer{

    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }
}
