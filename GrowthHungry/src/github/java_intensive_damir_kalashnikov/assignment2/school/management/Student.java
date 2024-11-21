package assignment2.school.management;


import assignment2.school.Person;

import java.util.List;

public class Student extends Person {
    private int studentID;
    private List<String> enrolledCourses;
    private double tuition;


    public double getTuition(){
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = enrolledCourses.size()  * 500;
    }

    public Student(int age, String name, int studentID ) {
        super(name, age);
        this.studentID = studentID;
    }

    public void enrollCourse(List<String>enrolledCourse){
        this.enrolledCourses = enrolledCourses;
    }
    public void enrolledCourses(String enrolledCourse){
        this.enrolledCourses.add(enrolledCourse);
    }
    public int getStudentId(){
        return studentID;
    }
}

