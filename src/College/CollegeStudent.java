package College;

/**
 * Created by User on 008 08.02.16.
 */
public class CollegeStudent extends Student {
    private int year = 0;//возвраст
    private String major = "";//предмет

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                ", year: " + year +
                ", idNumber: " + idNumber +
                ", major: '" + major + '\'' +
                '}';
    }
}
