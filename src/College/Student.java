package College;

/**
 * Created by User on 008 08.02.16.
 */
public class Student extends Person {
    protected String idNumber = "";//порядковый номер
    protected double gpa = 0;//средний балл

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getgpa() {
        return gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }
}
