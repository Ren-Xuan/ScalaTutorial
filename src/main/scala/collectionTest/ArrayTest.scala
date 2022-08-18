package collectionTest

object ArrayTest {
    def main(args: Array[String]): Unit = {
        val arr01 = new Array[Int](4)
        println(arr01.length)
        arr01.foreach(print)
        println(arr01)
        println("-" * 10)
        arr01(1) = 1;
        arr01.foreach(print)
        println(arr01)
        val arr02 = Array(0, 1, 2, 3)
        for (i <- 0 to arr02.length - 1) {
            print(arr02(i) + " ")
        }
        println()
        for (i <- 0 until arr02.length) {
            print(arr02(i) + " ")
        }
        println()
        for (i <- arr02.indices) {
            print(arr02(i) + " ")
        }
        println()
        for (e <- arr02) {
            print(e + " ")
        }
        println()
        //迭代器
        val iter = arr02.iterator
        while (iter.hasNext) {
            print(iter.next() + " ")
        }
        println("迭代器结束")
        //for each
        arr02.foreach(e => print(e + " "))
        println("lambda ended")

        val arr03 = arr02.:+(514)
        println(arr03.mkString(" "))
        val arr04 = arr02.+:(114)
        println(arr04.mkString(" "))
        //可以根据方法定义可以省略括号和.
        var arr05 = arr02 :+ 514
        println(arr05.mkString(" "))
        var arr06 = 19 +: 19 +: arr02 :+ 8 :+ 10
        println(arr06.mkString(" "))
    }
}
