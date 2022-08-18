package chapter04

object ErrorTest {
    def main(args: Array[String]): Unit = {
        try{
            val n = 10/0
        }catch {
            case e:ArithmeticException=>{
                println("发生算数异常")
            }
            case e:Exception=>{
                println("一般异常")
            }
        }finally {
            println("处理结束")
        }
    }
}
