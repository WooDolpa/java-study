package fastcampus.ch24;

/**
 * packageName : fastcampus.ch24
 * className : StudentSubjectTest
 * user : jwlee
 * date : 2022/10/11
 */
public class StudentSubjectTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);
    }

}
