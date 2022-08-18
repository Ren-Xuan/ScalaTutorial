package collectionTest

object MapTest {
    def main(args: Array[String]): Unit = {
        //默认不可变
        val dict: Map[Int, String] = Map(0 -> "zero", 1 -> "one")
        println(dict)
        for (e <- dict.keys) {
            println(dict(e))
        }
        dict.foreach(println)
        dict.foreach((kv: (Int, String)) => println(kv))
        println(dict.get(0).get)
        println(dict.getOrElse(114, "default val"))
        println(dict(1))
        //可变dict
        println("-" * 20)
        val dict2 = scala.collection.mutable.Map(0 -> "zero", 1 -> "one")
        dict2.put(114, "smells")
        println(dict2)
        dict2 += ((514, "aa"))
        println(dict2)
        println("-" * 20)
        //删除元素
        dict2.remove(114)
        println(dict2)
        dict2 -= (514)
        println(dict2)
        //修改元素
        println("-" * 20)
        dict2.update(0, "000000")
        dict2.update(1919, "add new data")
        println(dict2)
    }
}
