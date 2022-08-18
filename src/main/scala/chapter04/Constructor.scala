package chapter04

class Constructor {
    //著构造器可以用三种修饰符:1.不加、2.var、3.val
    var param0:Int=_
    var param1:String=_
    println("主构造方法被调用")

    def this(param0: Int) { //辅助构造器,还可以有多个,但要注意顺序
        this()//主构造器被调用
        println("2.辅助构造方法一被调用")
        this.param0 = param0;
        println(s"name:$param0 age: $param1")
    }
    def this(param0:Int,param1:String){
        this(param0)
        println("2.辅助构造方法二被调用")
        this.param1 = param1;
        println(s"name:$param0 age: $param1")
    }
    def constructor1():Unit={
        println("一般方法被调用")
    }
}
object  Constructor{
    def main(args: Array[String]): Unit = {
        val constructor1 = new Constructor;
        constructor1.constructor1()
        println("-"*20)
        val constructor2 = new Constructor(114);
        println("-"*20)
        val constructor3 = new Constructor(114, "五一四")
    }
}