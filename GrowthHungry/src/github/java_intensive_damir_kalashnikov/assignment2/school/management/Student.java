package assignment2.school.management;

import assignment2.school.Person;
import java.util.Arrays;

public class Student extends Person {
    private int studentID;
    private String[] enrolledCourses;
    private double tuition;


    public double getTuition(){
        return tuition;
    }

    public Student(int age, String name, int studentID ) {
        super(name, age);
        this.studentID = studentID;
        this.enrolledCourses = new String[8];
    }

    public void calculateTuition(){
        int numberOfCourses =0;
        for (String course : this.enrolledCourses){
          if (course != null){
              numberOfCourses++;
          }
        }
        this.tuition = numberOfCourses *500;
    }

    public void enrollCourse(String[] enrolledCourses) {
        for (String course : enrolledCourses) {
            enrollCourse(course);
        }
    }
        public void enrollCourse (String courseName){
            for (int i = 0; i < enrolledCourses.length; i++) {
                if (enrolledCourses[i] == null) {
                    this.enrolledCourses[i] = courseName;
                    break;
                }
            }
            calculateTuition();
            System.out.println("Student was enrolled in the course " + courseName);
        }

        public  void dropCourse(String courseName){
            for (int i =0; i< enrolledCourses.length; i++){
                if(courseName.equals(enrolledCourses[i])){
                    enrolledCourses[i]= null;
                    calculateTuition();
                    System.out.println("Student was removed from the course "+ courseName);
                    return;
                }
            }
            System.out.println("Course " + courseName + " not found for this student.");
        }

        public void displayTuition(){
            System.out.println("Tuition: $ "  + getTuition());
        }
        public void displayEnrolledClasses(){
            System.out.println("Student: " + name + " is enrolled in these courses: "+ Arrays.toString(enrolledCourses));
        }
        /*
        public int getStudentId(){
        return studentID;
        }*/

}

