import College.CollegeStudent;
import College.Person;
import College.Student;
import College.Teacher;

public class Main {

    public static void main(String[] args) {
//Write a testing class with a main() that constructs all of the classes (Person, Student, Teacher, and CollegeStudent.
        Person pers = new Person("Bob", 25, "M");
        Student stud = new Student("Sara", 28, "F", "DKS05132", 4.5);
        Teacher teach = new Teacher(100000.0, "Filosofic", "Stiv", 41, "M");
        CollegeStudent collStud = new CollegeStudent("Gary", 31, "M", "DJH1353", 5.0, 1985, "Electrical");
//Can be more than one instance for each) and place them into an array
//(Person[]).
        Person[] teachers = new Teacher[4];
        Person[] collegeStudents = new CollegeStudent[4];

        teachers[0] = new Teacher(35000.0, "Computer Science", "Stas", 35, "M");
        teachers[1] = new Teacher(45000.0, "Chemistry", "Susy", 25, "F");
        teachers[2] = new Teacher(55000.0, "English", "Backy", 28, "F");
        teachers[3] = teach;
        // teachers[4] = stud;
        //teachers[4] = pers;
        collegeStudents[0] = new CollegeStudent("Sveta", 22, "F", "FSR0212", 4.8, 1994, "Communications");
        collegeStudents[1] = new CollegeStudent("Donald", 20, "M", "GRE5460", 3.9, 1996, "Electrical Engineering");
        collegeStudents[2] = new CollegeStudent("Gena", 20, "M", "ETH4681", 4.3, 1996, "Communications");
        collegeStudents[3] = collStud;
        //collegeStudents[4] = stud;
        //collegeStudents[5] = pers;
//By using for-each, print the information about everybody from the array (call
// toString() on every instance)
        int i = 0;
        while (i != 4) {
            System.out.println(teachers[i].toString());
            ++i;
        }
        System.out.println();
        i = 0;
        while (i != 4) {
            System.out.println(collegeStudents[i].toString());
            ++i;
        }
    }
}
