package chapter07

object CovariantTest {
    def main(args: Array[String]): Unit = {
        val child:Parent = new Child
        //集合没有父子关系,那么就只有协变covariant
        val childList:MyCollection[Parent] = new MyCollection[Child]
        val childList2:MyCollection2[Parent] = new MyCollection2[subChild]
    }
}
class Parent{}
class Child extends Parent{}
class subChild extends  Child{}
//定义泛型集合类型
class MyCollection[+T]{

}

class MyCollection2[-T]{

}
//泛型上下限
class  PersonList[T<:Parent]{

}
//泛型上下文限定
class MyChild[T<:Parent]{
    //方法也可以用
}