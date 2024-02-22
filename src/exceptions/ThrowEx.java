package exceptions;

import java.io.FileNotFoundException;

public class ThrowEx {

    public static void validate(int  age) throws UserDefinedException {
        if(age < 18){
           // throw new ArithmeticException("you're  age  should be 18 to vote");
            throw new UserDefinedException("user defined exception");
                    //FileNotFoundException();

        }
        else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (UserDefinedException e) {
            throw new RuntimeException(e);
        }


    }
}
