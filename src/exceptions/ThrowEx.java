package exceptions;

public class ThrowEx {

    public static void validate(int  age){
        if(age < 18){
            throw new ArithmeticException("you're  age  should be 18 to vote");
        }
        else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception e) {
            System.out.println("call received");
        }
    }
}
