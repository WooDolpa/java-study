package fastcampus.chapter03.ch16.scheduler;

/**
 * packageName : fastcampus.chapter03.ch16.scheduler
 * className : PriorityAllocation
 * user : jwlee
 * date : 2022/11/07
 */
public class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("고객등급이 높은 고객의 call ");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println();
    }
}
