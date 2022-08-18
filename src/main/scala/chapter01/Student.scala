package chapter01

class Student(name: String, var age: Int) {//加了var就变成了public了，没有就是private
    def printInfo(): Unit = {
        println(this.name + "," + age + "," + Student.school);
    }
}

//引入一个伴生对象
object Student {
    val school: String = "MIT";//常量(value)

    def main(args: Array[String]): Unit = {
        var student = new Student("renxuan", age = 20);
        student.printInfo();
        println(args)
    }
}