package assignment2.school.management;

import assignment2.school.Person;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student (30, "John", 6784);
        Student student2= new Student (24, "Joe", 3456);
        Student student3= new Student (23, "Asel", 4567);

        CourseManager courseManager=new CourseManager();

        courseManager.addStudent(student1);
        courseManager.addStudent(student2);
        courseManager.addStudent(student3);

        //student1.enrollCourse("Kyrgyz Language");


    }
}
