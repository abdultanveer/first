//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
       Student abdul;
       abdul = new Student("ansari",123,true);
        System.out.println(abdul.name);

       Student  san = new Student("sanidhya",111,true);
        System.out.println("\nname is"+abdul.name);
        System.out.println(Student.COLLEGE_NAME);
        int sum = Util.add(abdul.age, san.age);
        System.out.println("sum  of ages  is--"+sum);
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}