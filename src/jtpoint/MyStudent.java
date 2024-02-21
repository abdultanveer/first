package jtpoint;

class MyStudent {
int rollno;  
String name;  
float fee;  
MyStudent(int rollno, String name, float fee){
this.rollno = rollno;
this.name = name;
this.fee = fee;
//this.display();
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1{  
public static void main(String args[]){  
MyStudent s1=new MyStudent(111,"ankit",5000f);
MyStudent s2=new MyStudent(112,"sumit",6000f);
s1.display();  
s2.display();  
}}  