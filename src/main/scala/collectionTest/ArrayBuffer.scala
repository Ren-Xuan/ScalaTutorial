package collectionTest;

import scala.collection.mutable.ArrayBuffer;

object ArrayBuffer {
    def main(args: Array[String]): Unit = {
        val arr1 = new scala.collection.mutable.ArrayBuffer[Int]()
        val arr2 = scala.collection.mutable.ArrayBuffer(114, 514, 19)
        println(arr1.mkString(" "))
        println(arr2.mkString(" "))
        arr1 += 1212;
        println(arr1.mkString(" "))
        val arrCopy = arr1
        println("same:" + (arrCopy == arr1))
        arrCopy.insert(1, 22222)
        println(arrCopy.mkString(" "))
        println(arr1.mkString(" "))
        arrCopy.remove(1)
        println(arrCopy.mkString(" "))
        println(arr1.mkString(" "))
        arr1 += 3333
        println(arr1.mkString(" "))
        arr1 -= 3333
        println(arr1.mkString(" "))
        arr1 -= 33332222
        println(arr1.mkString(" "))
        //转换
        val arrUnchangeable = arr1.toArray
        val arrChangeable = arrUnchangeable.toBuffer
        //二维数组
        val multiArray = Array.ofDim[String](2, 3)
        println("0,1:" + multiArray(0)(1))
        multiArray(0)(1) = "this is"
        println("0,1:" + multiArray(0)(1))
        //访问
        multiArray.foreach(e => e.foreach(println))
        multiArray.foreach(_.foreach(println))
    }
}
