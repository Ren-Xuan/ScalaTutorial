package chapter04

object ConstructorParams {
    def main(args: Array[String]): Unit = {
        val student1 = new Student1
        student1.name = "a"
        student1.age = 1
        println(s"student1:name=${student1.name},age = ${student1.age}")
        val student2 = new Student2("b",2)
        println(s"student1:name=${student2.name},age = ${student2.age}")
    }
}
//定义类
//无参构造器
class Student1{
    //单独定义属性
    var name:String = _
    var age:Int = _
}
//推荐写法
//上面等价于
class Student2(var name:String,var age:Int){

}
class Student3(nameArg:String,ageArg:Int){//这样就变成形参了，就不能通过.获取了,要用get方法
    //或者用这种方法
    var name :String =nameArg
    var age:Int = ageArg

}
class Student4(val name:String,val age:Int){

}
class Student5(var name:String,var age:Int){
    var school:String = _
    def this(name:String,age:Int,school:String){
        this(name,age)
        this.school = school
    }
}