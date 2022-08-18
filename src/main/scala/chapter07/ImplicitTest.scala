package chapter07

object ImplicitTest {
    def main(args: Array[String]): Unit = {
        //implicit关键字声明隐式参数，调用该方法的时候就可以传入该参数，编译器会在相应的作用域寻找符合条件的隐式值
        val new12 = new MyRichInt(12)
        println(new12.myMax(14))
        //考虑隐式转换
        //1.隐式函数
        implicit  def convert(num:Int):MyRichInt=new MyRichInt(num)
        println(12.myMax(14))
        //2.隐式类
        implicit class MyRichIntClass(val self: Double) {//只能放到这里
            def myMax(n: Double): Double = if (n < self) self else n

            def myMin(n: Double): Double = if (n < self) n else self

        }
        println(12.1.myMax(-12.3))
        //3.隐式参数
        def sayHello(implicit name:String):Unit={
            println("hello "+name)
        }
        implicit val ss:String = "bob"
        sayHello

    }
}
class MyRichInt(val self:Int){
    def myMax(n:Int):Int=if(n< self) self else n
    def myMin(n:Int):Int=if (n<self) n else self
}


