//19000782
//Q5

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q5{

    def isEven(m:Int): Boolean=m match{
        	case 0 => true
		case _ => isOdd(m-1)
   	}
	
	def isOdd(m:Int): Boolean={
     		! (isEven(m)) 
   	}
	
	def add(m:Int, n:Int=0 ,res:Int=0) : Int =n match{
		case x if (x==m) => res
		case x if ((x<m) && (isOdd(n))) => add(m,n+1,res)
		case x if ((x<m) && (! isOdd(n))) => add(m,n+1,res+n)
	}

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the no:");
        val num = input.nextInt();
        println(add(num));
    }
} 