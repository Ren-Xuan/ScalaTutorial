package chapter03

object FuncTest {
    def main(args: Array[String]): Unit = {
        def test(myArgs: String*): Unit = {
            println(myArgs)
        }

        test("123", "abc");
        test()

        def test2(defaultArg: String = "default string", ortherArg: String): Unit = {
            println(defaultArg)
            println(ortherArg)
        }

        test2(ortherArg = "second")

        //Scala 如果期望是无返回值类型，可以省略等号
        //如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
        def test3() {
            val a: Int = 1;
        }

        println(test3)
        println("end")

        //如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
        def test4: Unit = {
            println("do something without parameters");
        }
        //只用逻辑处理,那么可以省略名称和def
        {
            println("not def??????")
        }

        def test5(func: Any, args1: String): Unit = {
            println("func:", func);
            println(args1);
        }

        test5({
            println("参数直接加函数")
        }, "args1 is here");

        //匿名函数：如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
        def test6 = (x: String) => {
            println(x);
        }

        val test66 = (x: String) => {
            println(x)
        }

        test6("lambda def")
        test66("lambda val")

        def test7(func: String => Unit): Unit = {
            func("func is passed in and called");
        }

        test7(test6)
        println("匿名函数")
        println((x: String) => {
            println("lambda x in parameters")
        })

        def myPrintCall(func: String => Unit, arg1: String): Unit = {
            func("================")
            println(arg1)
        }

        myPrintCall(name => println(name), "this is arg1");
        myPrintCall(println(_), "this is arg1");
        myPrintCall(println, "this is arg1");


        println("higher function");

        def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
            fun(1, 2)
        }

        val add = (a: Int, b: Int) => a + b
        val minus = (a: Int, b: Int) => a - b
        println(dualFunctionOneAndTwo(add))
        println(dualFunctionOneAndTwo(minus))
        //在被调用函数 foo 后面加上 _，相当于把函数 foo 当成一个整体，传递给变量 f1
        val f1: ((Int, Int) => Int) => Int = dualFunctionOneAndTwo;;
        val f2 = dualFunctionOneAndTwo _;

        def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
            op(a, b)
        }

        println(dualEval(add, 1, 2))
        println(dualEval((a, b) => a + b, -2, -3))
        println(dualEval(_ + _, 12, 13))

        def guess(op: String): (Int, Int) => Unit = {
            def add(a: Int, b: Int): Unit = {
                println("add call a + b ", a + b)
            }

            def minus(a: Int, b: Int): Unit = {
                println("minus call a - b ", a - b)
            }

            if (op == "+") {
                return add
            } else {
                minus //这里的return 也可也删除,因为函数返回的是最后一层的
            }
        }

        println(guess("+")(1, 2))
        println(guess("-")(1, 2))
        val arr: Array[Int] = Array(1, 1, 4, 5, 1, 4);

        def arrayOp(array: Array[Int], op: Int => Int): Array[Int] = {
            for (elem <- array) yield op(elem);
        }

        val newArray: Array[Int] = arrayOp(arr, (a) => a * 2)
        println(newArray.mkString(","))
        val newArray2: Array[Int] = arrayOp(arr, _ + 1)
        println(newArray2.mkString(","))

        def f(aInt: Int): String => (Char => Boolean) = {
            def innerTest(aString: String): Char => Boolean = {
                def innerInnerTest(aChar: Char): Boolean = {
                    if (aInt == 0 && aString == "" && aChar == '0') false else true
                }

                innerInnerTest //作为一个函数返回
            }

            innerTest
        }

        println(f(0)("")('0'))

        //匿名版本
        def fNoneName(aInt: Int): String => (Char => Boolean) = {
            (aString: String) => {
                (aChar: Char) => {
                    if (aInt == 0 && aString == "" && aChar == '0') false else true
                }
            }

        }

        println(fNoneName(0)("")('0'))

        def fNoneNameHigher(aInt: Int): String => (Char => Boolean) = {
            aString =>
                aChar =>
                    if (aInt == 0 && aString == "" && aChar == '0') false else true

        }

        println(fNoneNameHigher(0)("")('0'))

        //柯里化
        def funcCurrying(aInt: Int)(aString: String)(aChar: Char): Boolean = {
            if (aInt == 0 && aString == "" && aChar == '0') false else true
        }

        //closure
        def add1(a: Int, b: Int): Int = {
            a + b
        }

        //1.考虑固定一个加数的场景
        def myAddByFour(b: Int): Int = {
            4 + b
        }

        //2.扩展固定加数改变的情况
        def addByFive(b: Int): Int = {
            5 + b
        }

        //3.将固定加数作为另一个参数传入，但是作为第一层参数传入
        def addByFour1(): Int => Int = {
            val a = 4;

            def addB(b: Int): Int = {
                a + b
            }

            addB
        }

        //柯里化
        def addCurrying(a: Int)(b: Int): Int = {
            a + b
        }

        println(addCurrying(114)(_))
        println(addCurrying(114)(514))

        //控制抽象
        def fAbstract = () => {
            println("f...")
            114514
        }

        foo(fAbstract()) //传送代码块
        //
        foo({
            println("pass code")
            111
        }) //省略小括号
        foo {
            println("pass code")
            111
        }
        //用递归自定义while循环
        var i: Int = 1;
        myWhile(i <= 10) {
            print(" " + i)
            i += 1;
        }
        //惰性加载
        /*
        当函数返回值被声明为 lazy 时，函数的执行将被推迟，直到我们首次对此取值，
        该函数才会执行。这种函数我们称之为惰性函数。
         */
        println("\n=======================")
        lazy val res = sum(10, 30)
        println("========lazy not called===========")
        println("res=" + res)


    }

    def foo(a: => Int): Unit = { //注意这里变量 a 没有小括号了，一般是a:Int
        println(a)
        println(a)
    }

    def myWhile(condition: => Boolean)(op: => Unit): Unit = {
        if (condition) {
            op
            myWhile(condition)(op)
        }
    }


    def sum(n1: Int, n2: Int): Int = {
        println("sum is called ,")
        n1 + n2
    }


}
