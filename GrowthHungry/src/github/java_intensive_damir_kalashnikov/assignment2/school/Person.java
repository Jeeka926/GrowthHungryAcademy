package assignment2.school;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Student's name: "+name +". Student's age: "+ age +".");
    }
}
