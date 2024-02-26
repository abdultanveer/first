package lamdas;

public class LamdaDemo {
    public static void main(String[] args) {
        //life  before lamdas
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        //life after lamdas
        Sayable s1 = () -> {System.out.println("you're saying something");};
        s1.say();
    }
}
