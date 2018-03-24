import java.util.Arrays;
public class Course {
    private String courseName;//stores name of course
    private String[] students = new String[100];//stores student names
    private int numberOfStudents;//stores number of students in course

    //constructor that assigns a name to the course
    public Course (String courseName) {
        this.courseName = courseName;
    }

    //method that adds students to course
    public void addStudent(String student) {
        if(numberOfStudents >= students.length) {
            String[] newStudents = new String[students.length * 2];
            for(int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = new String[newStudents.length];
            for(int i = 0; i < students.length; i++) {
                students[i] = newStudents[i];
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    //method that returns the names of the sudentss in the course
    public String[] getStudents() {
        String[] studentsCopy = new String[numberOfStudents];
        for(int i = 0; i < studentsCopy.length; i++) {
            studentsCopy[i] = students[i];
        }
        return studentsCopy;
    }

    //accessor method for numberOfStudents
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //accessor method for courseName
    public String getCourseName() {
        return courseName;
    }
    
    //method that drops a student from the course
    public void dropStudent(String student) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == student) {
                students[i] = null;
                numberOfStudents--;
            }
        }
    }

    //method that clears all students from course
    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }

    //tester method
    public static void main(String[] args) {
        Course test = new Course("Math");
        System.out.println("Course is " + test.getCourseName() + ". There are " + test.getNumberOfStudents() + " students in this course.");

        test.addStudent("Jane Shepard");
        test.addStudent("John Shepard");
        test.addStudent("Noni Lavellan");
        test.addStudent("Marian Hawke");
        System.out.println("There are now " + test.getNumberOfStudents() + " students. They are " + Arrays.toString(test.getStudents()));

        test.dropStudent("John Shepard");
        System.out.println("There are now " + test.getNumberOfStudents() + " students. They are " + Arrays.toString(test.getStudents()));

        test.clear();
        System.out.println("There are now " + test.getNumberOfStudents() + " students. They are " + Arrays.toString(test.getStudents()));

        for(int i = 0; i < 150; i++) {
            test.addStudent("fakeStudent");
        }
        System.out.println("There are now " + test.getNumberOfStudents() + " students.");
    }
}
