package assignment2.school;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: "+name +" age: "+ age);
    }

    public int getAge() {
        return age;
    }
}
