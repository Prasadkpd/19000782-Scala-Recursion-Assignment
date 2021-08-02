//19000782
//Q6

import scala.io.StdIn.readInt;

object Q6{

    def fibonacai(a:Int):Int= a match{
        case 0=>0
        case x if(x==1) => 1
        case _ => fibonacai(a-1)+fibonacai(a-2)
    }

    def fibonacaiSeq(a:Int):Unit={
        if(a>0){
            fibonacaiSeq(a-1)
            println(fibonacai(a))
        }
    }

    def main(args:Array[String]){
       
        println("Enter the number:");
        val num = scala.io.StdIn.readInt();
        fibonacaiSeq(num);
    }
} 