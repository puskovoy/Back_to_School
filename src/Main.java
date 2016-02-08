import College.CollegeStudent;
import College.Person;
import College.Teacher;

public class Main {

    public static void main(String[] args) {

        Person[] teachers = new Teacher[3];
        Person[] collegeStudents = new CollegeStudent[3];

        teachers[0] = new Teacher(35000.0, "Computer Science", "Stas", 35, "M");
        teachers[1] = new Teacher(45000.0, "Chemistry", "Susy", 25, "F");
        teachers[2] = new Teacher(55000.0, "English", "Backy", 28, "F");
        collegeStudents[0] = new CollegeStudent("Sveta", 22, "F", "FSR0212", 4.8, 1994, "Communications");
        collegeStudents[1] = new CollegeStudent("Donald", 20, "M", "GRE5460", 3.9, 1996, "Electrical Engineering");
        collegeStudents[2] = new CollegeStudent("Gena", 20, "M", "ETH4681", 4.3, 1996, "Communications");

        int i = 0;
        while (i != 3) {
            System.out.println(teachers[i].toString());
            ++i;
        }
        i = 0;
        while (i != 3) {
            System.out.println(collegeStudents[i].toString());
            ++i;
        }


    }
}
