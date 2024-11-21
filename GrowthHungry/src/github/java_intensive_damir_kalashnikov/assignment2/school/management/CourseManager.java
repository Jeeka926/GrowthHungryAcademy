package assignment2.school.management;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList <Student> students;

    public CourseManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        //Adds a student to the array.
        students.add(student);
    }


    public void displayAllStudents() {
        //Loops through the list and displays the details of all students.
    }
}
