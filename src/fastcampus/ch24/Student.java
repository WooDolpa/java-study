package fastcampus.ch24;

import java.util.ArrayList;

/**
 * packageName : fastcampus.ch24
 * className : Student
 * user : jwlee
 * date : 2022/10/11
 */
public class Student {

    int studentId;
    String studentName;

    ArrayList<Subject> subjectArrayList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        this.subjectArrayList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);

        this.subjectArrayList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for (Subject subject : subjectArrayList) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + " 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
    }

}
