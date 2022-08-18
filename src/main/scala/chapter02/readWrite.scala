package chapter02

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

object readWrite {
    def main(args: Array[String]): Unit = {
        /**
         * StdIn.readLine()
         * StdIn.readDouble()
         * StdIn.readInt()
         *
         *
         *
         * val a = StdIn.readLine();
         * val age = StdIn.readInt();
         * val weight = StdIn.readDouble();
         * println(s"${a},${age},${weight}\n")
         *
         */
        //文件读取
        Source.fromFile("src/main/resources/test.txt").foreach(print);
        //数据写入文件
        val writer = new PrintWriter(new File("src/main/resources/out.txt"))
        writer.write("fuck u tooooooo")
        writer.close()
    }
}
