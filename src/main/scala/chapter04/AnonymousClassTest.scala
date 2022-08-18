package chapter04

object AnonymousClassTest {
    def main(args: Array[String]): Unit = {
        val person: PersonAnon = new PersonAnon {
            override var name: String = "newname"

            override def eat(): Unit = {
                println(s"${name} eat some thing")
            }
        }
        person.eat();
    }
}
abstract  class PersonAnon{
    var name:String
    def eat():Unit
}