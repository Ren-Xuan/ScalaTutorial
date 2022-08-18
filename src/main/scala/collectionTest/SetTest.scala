package collectionTest

object SetTest {
    def main(args: Array[String]): Unit = {
        val set0 = Set(1, 3, 1, 3)
        println(set0)
        //添加元素
        val set1 = set0 + 4
        println(set1)
        //合并set
        val set2 = Set(1, 2, 3, 4, 5, 6, 7)
        val set3 = set0.union(set2)
        val set4 = set0 ++ set2
        println(set0)
        println(set3)
        println(set4)
        println(set4 - 1)
        //可变的集合
        val set5 = scala.collection.mutable.Set(0, 1)
        val set6 = set5 + 1111
        println(set6)
        set5 += 123
        println(set5)
        val set7 = scala.collection.mutable.Set(-1, -2)
        println(set5)
        println(set7)
        val set8 = set7 ++ set5
        println(set8)
        set7 ++= set5
        println(set7)
    }
}

