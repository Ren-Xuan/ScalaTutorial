package collectionTest

import scala.collection.mutable

object QueueTest {
    def main(args: Array[String]): Unit = {
        val q = new mutable.Queue[Int]()
        q.enqueue(1)
        q.enqueue(2, 3, 4)
        println(q)
        println(q.dequeue())
        println(q)
        val q2 = scala.collection.immutable.Queue("a","b","c","d")
        val q3 = q2.enqueue("fff")
        println(q3)
        println(q2)
    }
}
