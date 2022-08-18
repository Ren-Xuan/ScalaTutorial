package chapter04

object TraitTest {
    def main(args: Array[String]): Unit = {
        val student=new Student8
        student.sayHello()
        student.play()
        student.dating()
        student.study()
    }
}
class Person8{
    val name:String="person"
    var age:Int = 0
    def sayHello():Unit={
        println(s"Person: ${name} say hello")
    }
}
//定义Trait
trait Young{
    //可以定义抽象或者非抽象的属性和方法
    var age:Int
    val name:String = "young"
    def play():Unit={
        println(s"Young: ${name} is playing")
    }
    def dating():Unit
}
class Student8 extends  Person8 with Young {
    //重写冲突属性
    override val name: String = "student";
    //实现抽象方法
    override def dating(): Unit = {
        println(s"student: ${name} dont have time dating")
    }
    def study():Unit={
        println(s"student: ${name} is studying")
    }

    override def sayHello(): Unit = {
        println(s"student: ${name} say hello")
    }
}
