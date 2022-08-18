package patternMatch

object PatternObject {
    def main(args: Array[String]): Unit = {
        val student = new Student("alice", 10)
        val result = student match {
            case Student("alice", 10) => "yes!"
            case _ => "no!"
        }
        val student2 = new Student("alice", 114)
        println(result)
        val result2 = student2 match {
            case Student("alice", 114) => "yes!"
            case _ => "no!"
        }
        println(result2)
    }
}

case class Student1(val name: String, val age: Int) //样例类

class Student(val name: String, val age: Int)

object Student {
    def apply(name: String, age: Int): Student = new Student(name, age)

    //必须定义一个unapply方法，用来对对象属性进行拆解
    def unapply(student: Student): Option[(String, Int)] = {
        if (student == null) {
            None
        } else {
            Some((student.name, student.age))
        }
    }
}