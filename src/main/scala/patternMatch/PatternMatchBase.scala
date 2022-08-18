package patternMatch

object PatternMatchBase {
    def main(args: Array[String]): Unit = {
        val x: Int = 2
        val y: String = x match { //这里不需要break语句
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case _ => "default" //没有的时候不匹配就会抛出match error
        }
        println(y)
        val a = 25
        val b = 13

        def matchDialOp(op: Char) = op match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => 1.0 * a / b
            case _ => "error"
        }

        println(matchDialOp('x'))
        println("=" * 20)

        //模式守卫
        //get the abs value of some Int vals
        def abs(num: Int): Int = {
            x match {
                case i if i >= 0 => i
                case i if i < 0 => -i
            }
        }
    }
}
