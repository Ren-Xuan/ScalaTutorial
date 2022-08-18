package collectionTest

import scala.collection.mutable.ListBuffer

case object ListBufferTest {
    def main(args: Array[String]): Unit = {
        val list1 = new ListBuffer[Int]();
        val list2 = ListBuffer(1, 2, 3, 4)
        println(list1)
        println(list2)
        list1.append(0)
        list1.prepend(0)
        list2.insert(0, -1)
        println(list2)
        -100 +=: (-50) +=: list1 += 50 += 100
        println(list1)
        //连接list
        println(list2)
        val list3 = list1 ++ list2
        println(list1)
        println(list2)
        println(list3)
        list1 ++=: list3
        println(list3)
        println(list1)
        list3(0) = -1001
        println(list3)
        list3.remove(0)
    }
}
