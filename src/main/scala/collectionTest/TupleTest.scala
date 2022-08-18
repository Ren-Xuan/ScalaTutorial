package collectionTest

object TupleTest {
    def main(args: Array[String]): Unit = {
        val t = (0, "1", 2.0)
        println(t._1)
        println(t.productElement(0))
    }
}
