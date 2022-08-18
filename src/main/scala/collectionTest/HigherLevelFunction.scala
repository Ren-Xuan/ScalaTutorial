package collectionTest

object HigherLevelFunction {
    def main(args: Array[String]): Unit = {
        val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
        val map2 = scala.collection.mutable.Map("a" -> 100, "b" -> 100, "c" -> 100, "d" -> 100)
        val map3 = map1.foldLeft(map2)((mergedMap, kv) => {
            val key = kv._1
            val value = kv._2
            val newVal = mergedMap.getOrElse(key, 0) + value
            mergedMap(key) = newVal
            mergedMap//为什么加了return就不行
        })
        println(map3)
    }

}
