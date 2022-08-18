package chapter04

object SelfTypeTest {
    def main(args: Array[String]): Unit = {
        var user = new RegisterUser("newUser",114)
        user.insert();
        println(user.isInstanceOf[String])
        user.asInstanceOf[Object]

    }
}
trait UserDAO{
    //可以认为自身里面有一个User
    _:User=>
    def insert():Unit={
        println(s"insert into db:${this.name}")
    }
}

class User(val name:String,val password:Int){

}

//定义注册用户类
class RegisterUser(name:String,password:Int) extends User(name,password) with UserDAO{
    //实现依赖注入
}