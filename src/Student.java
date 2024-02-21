public class Student {
public static String COLLEGE_NAME = "IIT";
    String name;
    int age;
    boolean isEligible;

    //pranav
    public Student(String name, int age, boolean isEligible) {
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
    }

    //bhoomika
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.isEligible = true;
    }

    public Student(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(this.name);
    }
}
