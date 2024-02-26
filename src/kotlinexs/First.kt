package kotlinexs

import jtpoint.TStudent

class First {
}
fun sum(x: Int, y: Int):Int = x + y


fun main() {
    val temperature = 20
    val isHot = if (temperature > 40) true else false


    println("The sum is "+ sum(20,30))
   // String msg = "how are you";
    var  msg:String  = "how are you"
    var age = 20
    println("hello kotlin-"+msg)

    var tEmp = Employee("abc",123,true,"blr")
    var mStd  = TStudent(12,"tstudent",43.0f)

    println("name is  "+tEmp.name)


}