package fastcampus.ch12;

/**
 * packageName : fastcampus.ch12
 * className : Person
 * user : jwlee
 * date : 2022/10/09
 */
public class Person {

    String name;
    int age;

    public Person() {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
        System.out.println(person);
    }
}
