package chapter04

object TraitTestMinin {
    def main(args: Array[String]): Unit = {
        val student=new Student9
        student.sayHello()
        student.play()
        student.dating()
        student.study()
        student.increase();
    }
}
class Person9{
    val name:String="person"
    var age:Int = 0
    def sayHello():Unit={
        println(s"Person: ${name} say hello")
    }
}
//定义Trait
trait Young9{
    //可以定义抽象或者非抽象的属性和方法
    var age:Int
    val name:String = "young"
    def play():Unit={
        println(s"Young: ${name} is playing")
    }
    def dating():Unit

    def sayHello(): Unit = {
        println(s"Young: ${name} say hello")
    }
}
trait  Knowledge{
    var amount:Int=0
    def increase():Unit
}
class Student9 extends  Person8 with Young9 with  Knowledge {
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
        super[Young9].sayHello();
        println(s"student: ${name} say hello")
    }

    override def increase(): Unit = {
        this.amount+=1
        println(s"after:${this.amount}")
    }
}
