package collectionTest

object HighLevelFunction {
    def main(args: Array[String]): Unit = {
        val list = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        //过滤操作
        val res1 = list.filter(p => p % 2 == 0)
        val res2 = list.filter(_ % 2 == 0)
        println(res1)
        //map操作
        println("map")
        println(list.map(_ * 2))
        println(list.map(x => x * x))
        //扁平化
        println("扁平化")
        val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4), List(5, 6, 7, 8, 9))
        println(nestedList.flatten)
        //扁平映射
        println("将一组字符串进行分词，并保存在单词列表")
        val strings = List("hello world", "hello scala", "hello java", "python yes")
        val splitList = strings.map(string => string.split(" ")).flatten
        println(splitList)
        println("扁平映射")
        println(strings.flatMap(_.split(" ")))
        //group map
        println("group map")
        println(list.groupBy(data => {
            if (data % 2 == 0) "odd" else "even"
        }))
        println(list.groupBy(_ % 2))
        //reduce
        println("reduce")
        println(list.reduce((a, b) => a + b))
        println(list.reduce(_ + _))
        println(list.reduceLeft(_ + _))
        println(list.reduceRight(_ + _))
        val list2 = List(3, 4, 5, 6, 7)
        println(list2.reduce(_ - _))
        //reduceright是递归(看源码)
        println(list2.reduceRight(_-_))
        //fold
        println("fold")
        println(list.fold(10)(_+_))//10+sum(list)
        println(list.fold(10)(_-_))//10-1-2-3..
        println(list.foldRight(10)(_-_))//看源码
    }

}
