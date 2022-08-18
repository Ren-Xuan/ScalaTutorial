package patternMatch

object PatterMatchType {
    def main(args: Array[String]): Unit = {
        //1.匹配常量
        def describeConst(x: Any): String = x match {
            case 1 => "number"
            case "h" => "String"
            case true => "boolean"
            case '+' => "char"
            case _ => "?"
        }

        //2.匹配类型
        def describeType(x: Any): String = x match {
            case i: Int => "Int"
            case s: String => "String"
            case b: Boolean => "boolean"
            case c: Char => "char"
            case ls: List[String] => "list String"
            case li: List[Int] => "list int"
            case ai: Array[Int] => "array"
            case _ => "?"
        }

        println(describeType(Array(1, 23, 3)))
        println(describeType(List(1, 23, 3))) //泛型擦除，而Array就不会发生这样的情况
        println(describeType(List("2", "23", "3")))
        println("匹配数组")
        //3.匹配数组
        for (arr <- List(
            Array(0),
            Array(1, 2),
            Array(0, 1, 2),
            Array("3", "4", "5")
        )) {
            val result = arr match {
                case Array(x, y) => "赋值" + x + "," + y
                case Array(0, _*) => "以0开头的"
                case Array(x, 1, z) => "中间为1的"
                case _ => "?"
            }
            println(result)
        }
        //4.匹配列表
        println("匹配列表")
        for (arr <- List(
            List(0),
            List(1, 2),
            List(0, 1, 2),
            List("3", "4", "5")
        )) {
            val result = arr match {
                case List(x, y) => "赋值" + x + "," + y
                case List(0, _*) => "以0开头的"
                case List(x, 1, z) => "中间为1的"
                case _ => "?"
            }
            println(result)
        }
        println("方式2")
        val list = List(0, 1, 2, 3, 4, 5, 6)

        def listMatch(l: List[Int]) = list match {
            case first :: second :: res => println(first, second, res)
            case _ => "?"
        }

        listMatch(list)
        //5.元组匹配
        println("元组匹配")
        for (tuple <- List(
            (0, 0),
            (0, 1),
            (0, 1, 0),
            ("a", true, 0.5)
        )) {
            val res = tuple match {
                case (a, b) => "a:" + a + ",b=" + b
                case (a, 1, b) => "a:" + a + ",and 1 and b=" + b
                case (a, 1, _) => "a:" + a + ",and 1 and any"
                case _ => "other"
            }
            println(res)
        }
        println("匹配=================")
        val List(first, second, _*) = List(1, 2, 3, 4, 5, 6)
        println(s"first:${first},second:${second}")
        val fir :: sec :: rest = List(-1, -2, -3, -4)
        println(s"first:${fir},second:${sec},rest:${rest}")
        //for 推导式中匹配
        val list2 = List(("a", 1), ("b", 2), ("c", 3))
        //原本的遍历方式
        println("原本的遍历方式")
        for (e <- list2) {
            println(e._1, e._2)
        }
        //新的遍历方式
        println("新的遍历方式")
        for ((a, _) <- list2) {
            println(a)
        }
        println("可以指定某个位置的值必须是多少")
        for (("a", value) <- list2) {
            println(value)
        }
    }
}
