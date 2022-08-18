package collectionTest

object CollectionOps2 {
    def main(args: Array[String]): Unit = {
        val list = List(-1, 2, -2, 1, -3, 3, 4, -4)
        println(list.max)
        println(list.min)
        println(list.sorted)
        println(list.sorted.reverse)
        println(list.sorted(Ordering[Int].reverse))
        println(list)
        println(list.sortWith((a: Int, b: Int) => a >= b))
        println(list.sortBy(a => {
            -a
        }))
        println(list.sortBy(-_))
    }

}
