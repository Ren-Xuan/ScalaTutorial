package collectionTest

object Parallel {
    def main(args: Array[String]): Unit = {
        val res = (1 to 100).map(e=>{
            Thread.currentThread().getName;
        })
        println(res)
        val res2 = (1 to 100).par.map(e => {
            Thread.currentThread().getName;
        })
        println(res2)

    }
}
