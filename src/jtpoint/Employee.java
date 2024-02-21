package jtpoint;

public class Employee {
    float salary  = 4000;

}

class Programmer extends Employee{
    int  bonus = 10000;

    public static void main(String[] args) {
        Programmer  p =  new Programmer();
        System.out.println("salary is--"+p.salary);
        System.out.println("bonus is --"+p.bonus);
    }
}