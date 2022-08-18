package collectionTest

object CollectionOps {
    def main(args: Array[String]): Unit = {

        val list1 = List(1, 2, 3, 4, 5, 6, 7, 8)
        println(list1)
        println(list1.tail)
        println(list1.init)
        println(list1.take(3))
        println(list1.takeRight(3))
        //去掉后面的元素
        println(list1.drop(3))
        println(list1)
        println(list1.dropRight(1))
        println(list1)
        println("Union " * 10)
        val list2 = List(-3, -2, -1, 0, 1)
        val list = list2.union(list1)
        println(list)
        println("Intersect " * 10)
        val list3 = list1.intersect(list2)
        println(list3)
        println("diff " * 10)
        println(list1.diff(list2))
        println("拉链 " * 10)
        println(list1)
        println(list2)
        println(list1.zip(list2))
        println("滑窗 " * 10)
        list1.sliding(3).foreach((e) => print(e + " "))
        println()
        list1.sliding(3, step = 3).foreach((e) => print(e + " "))
        println()
    }
}
