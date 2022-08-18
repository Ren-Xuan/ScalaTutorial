package chapter02

import scala.util.control.Breaks

object Control {
    def main(args: Array[String]): Unit = {
        // Loop
        for (i <- -1 to 3) {
            print(i + " ")
        }
        println("loop ended clear i")
        for (i <- -1 until (3)) {
            print(i + " ")
        }
        println("until loop ended")

        for (i <- -1 to 3 by 2) {
            print(i + " ")
        }
        println("loop with step 2")
        for (i <- -1 to 2 by 2; j <- -1 to 1) {
            println(s"i=${i},j=${j}")
        }
        for(i<- -1 to 2 reverse){
            print(i + " ")
        }
        println("reverse loop")
        println("double loop")
        for (i <- -1 to 3; j = 4 - i) {
            println(s"i=${i},j=${j}")
        }
        //另一种写法就是
        for {
            i <- -1 to 3
            j = 4 - i
        } {
            println(s"i=${i},j=${j}")
        }
        Breaks.breakable{
            for(i<- -1 to 10){
                println(i)
                if(i>=0){
                    println("break")
                    Breaks.break()//or break
                }
            }
        }
        for (i <- -1 to 3 if i != 0) {
            print(i + " ")
        }
        println("pass the condition")

    }
}
