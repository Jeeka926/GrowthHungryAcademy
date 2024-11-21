package business;

public class Person {
    //variable - holds a value
    //java is a staticly typed language what type of the data storing and/or referring
    //JS is a dynamicly typed language
    private String firstName;
    private String middleName = "Jeeka";
    private int age;
    private long id;
    private char middleInitial;
    private byte myByte;
    static private Company company = new Company();
    static private Company company1 = new Company();
    private NewsAgency agency;
    private final double PI = 3.14;
    private final String MY_BIGCONSTANT = "Hi this is my constant message";

    //method a block of code where things get done. and method is a function inside of the class. they have to be contained within the class.

    public void sayHello(){
    System.out.println("Hello");
}
    public void saySomething(String message){
        System.out.println(message);
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public static void main (String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("Allah, can do everything possible!");
        p1.saySomething("So, enjoy the process of getting better at everything my beautiful Jeeka! and miracle will happen in the right time and you will get married to my dream man to create beautiful family!");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(26,29));
    }

}
