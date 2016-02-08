package College;

/**
 * Created by User on 008 08.02.16.
 */
public class Teacher extends Person {
    private double salary = 0;//зарплата
    private String subject = "";//тема урока

    public Teacher(double salary, String subject, String name, int age, String gender) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name: '" + name + '\'' +
                ", age: '" + age + '\'' +
                ", salary: " + salary +
                ", subject: '" + subject + '\'' +
                ", gender: '" + gender + '\'' +
                '}';
    }
}
