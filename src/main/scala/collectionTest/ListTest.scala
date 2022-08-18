package collectionTest

object ListTest {
    def main(args: Array[String]): Unit = {
        //create a list
        val list1 = List(2, 3, 4, 5)
        println(list1)
        val list2 = 1 +: list1
        val list3 = list1 :+ 6
        val list4 = list1.::(1) //add first
        println(list4)
        println(list1)
        //那就是用::创建新列表
        val newList = Nil.::(0)
        println(newList)
        val newList2 = 0 :: 1 :: Nil
        println(newList2)
        //列表list3追加在head一个list2
        val list5 = list2 :: list3
        println(list5)
        //列表相加
        val list6 = list2 ::: list3
        println(list6)
        //也是列表相加
        val list7 = list2 ++ list3

    }
}
