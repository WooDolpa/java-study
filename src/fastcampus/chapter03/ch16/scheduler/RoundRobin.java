package fastcampus.chapter03.ch16.scheduler;

/**
 * packageName : fastcampus.chapter03.ch16.scheduler
 * className : RoundRobin
 * user : jwlee
 * date : 2022/11/07
 */
public class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원게 배분합니다.");
    }
}
