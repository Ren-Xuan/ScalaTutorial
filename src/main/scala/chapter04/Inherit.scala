package chapter04

object Inherit {
    def main(args: Array[String]): Unit = {

    }
}

class Person(){
    var name:String= _
    var age:Int=_
}
class Student6(name:String,age:Int) extends Person{
    var sex:String=_;
    def this(name:String,age:Int,sexArg:String){
        this(name,age)
        this.sex = sexArg
    }
}