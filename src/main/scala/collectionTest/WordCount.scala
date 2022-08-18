package collectionTest

object WordCount {
    def main(args: Array[String]): Unit = {
        val stringList = List(
            "hello",
            "hello world",
            "hello scala",
            "hello spark from scala",
            "hello scala from java"
        )
        //1.对字符串进行切分
        //        var wordList1 = stringList.map(_.split(" "))
        //        wordList1.foreach(e => {
        //            e.foreach(x => print(x + " "));
        //            println
        //        })
        val wordList1 = stringList.flatMap(_.split(" "))
        //2.对单词进行分组
        val groupMap = wordList1.groupBy(word => word)
        groupMap.foreach(println)
        //3.count
        val countMap = groupMap.map(kv => (kv._1, kv._2.length))
        println(countMap)
        //map to list
        val res = countMap.toList.sortBy(-_._2).take(3).map(e => e._1)
        println(res)
        //简写
        val n = 3
        val res2 = stringList.flatMap(_.split(" ")).groupBy(e => e).map(kv => (kv._1, kv._2.length)).toList.sortBy(-_._2).take(n).map(e => e._1)
        println("简写")
        println(res2)
        val stringListMap = List(
            ("hello", 2),
            ("hello world", 3),
            ("hello scala", 4),
            ("hello spark from scala", 5),
            ("hello scala from java", 6),
        )
        println("复杂版本")
        val res3 = stringListMap.flatMap(kv => {
            kv._1.split(" ").map(subs => (subs, kv._2))
        }).groupBy(_._1).mapValues(kvList => {
            kvList.map(_._2).sum
        }).toList.sortBy(-_._2).take(n).map(_._1)
        println(res3)
    }
}
