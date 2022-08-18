package chapter02

import chapter01.Student

object Variable {
    def main(args: Array[String]): Unit = {
        //声明一个变量
        var a: Int = 1;
        val a1 = 2;
        //类型确定后不能修改

        //scala不允许不赋初值(没有java的自动填充)
        //因为类成员变量都成了括号里面的传参，因此基本不会出现不赋初值的代码
        var rx: Student = null //这里必须是var,因为用val之后存在修改操作
        rx = new Student("rx", 20)
        rx.age = 114
        rx.printInfo()
        printf("a= %d,b=%f\n", rx.age, 1.2);
        println(s"age is ${rx.age} ")
        //Type
        val aInt: Int = 1;
        val aBit: Byte = -128;
        val aShort: Short = 12312;
        val aDouble: Double = 114.514;
        val aLong: Long = 12212121221L;
        val aLongToInt: Int = (12L).toInt;
        //浮点数
        val f1: Float = 19.19f;
        val d1: Double = 81.0;
        //布尔
        val isTrue: Boolean = true
        //char
        val c1: Char = 'a';

        //空类型
        /*
            Unit 和void等同，只用于替换void
            Null,等于null
            Noting所有Scala类型的子类,什么都没有
            Noting用于指定返回类型,这样就能把返回的值(异常)赋给其他函数
         */
        def func1(): Unit = {
            println("f is called");
        }

        val ret = func1();
        println(ret)
        var student = new Student("x", 20)
        student = null;

        def noFunc(n: Int): Int = {
            if (n > 0) {
                return 1;
            }
            throw new NullPointerException();
        }

        val ret2 = noFunc(2);
        println(ret2);

        //运算符号
        println(1 == 1)
        println("hello" == "hello")
        println("hello" == new String("hello"))
        println("hello".equals(new String("hello")))
        println("hello".eq(new String("hello")))
        //当调用对象的方法时，.可以省略
        //如果函数参数只有一个，或者没有参数，()可以省略

        val i: Int = 1.+(1);
        val j: Int = 1 + (1)
        val k: Int = 1 + 1;
        //以上三个意思都一样,后面两种是简写
        println(1 toString())
        println(1 toString)

        //条件判断
        //Scala 中 if else 表达式其实是有返回值的，具体返回值取决于满足条件的代码体的最后一行内容
        //Scala 中返回值类型不一致，取它们共同的祖先类型。
        val age = 18.+(1);
        val res: Any = if (age < 18) {
            "child"
        } else if (age >= 18 && age < 30) {
            if (age <= 20) {
                "like child"
            } else {
                "not any more"
            }
        } else {
            100
        }
        println(res);
        //三元运算符就变成了
        val res2: Any = if (age < 18) "child" else -1
        println(res2)


    }

}
