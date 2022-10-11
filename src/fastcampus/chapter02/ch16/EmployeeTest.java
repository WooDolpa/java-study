package fastcampus.chapter02.ch16;

/**
 * packageName : fastcampus.ch16
 * className : EmployeeTest
 * user : jwlee
 * date : 2022/10/10
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 "+  employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 "+  employeeKim.getEmployeeId());
    }

}
