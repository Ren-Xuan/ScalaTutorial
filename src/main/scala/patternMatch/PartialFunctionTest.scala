package patternMatch

object PartialFunctionTest {
    def main(args: Array[String]): Unit = {
        val list = List(("a",1),("b",2),("c",3))
        val newList = list.map(t=>(t._1,t._2+""))
        println(newList)
        val newList2 = list.map(e=>{
            e match {
                case (word,count)=>(word,count+"")
            }
        })
        val newList3 = list.map {
            case (word, count) => (word, count + "")
        }
        println(newList3)
        //偏函数的绝对值
        val positiveAbs:PartialFunction[Int,Int]={
            case x if x>0 => x
        }
        val negativeAbs: PartialFunction[Int, Int] = {
            case x if x < 0 => -x
        }
        val zeroAbs: PartialFunction[Int, Int] = {

            case x if x == 0 => 0
        }
        def abs(x:Int):Int=(positiveAbs orElse negativeAbs orElse zeroAbs)(x)
        println(abs(-113))
    }
}
