//19000782
//Q1

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q1{

    def GCD(a:Int,b:Int):Int = b match{
        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }

    def prime(a:Int, b:Int=2):Boolean = b match{
        case x if(x==a) => true
        case x if GCD(a,x)>1 =>false
        case x => prime(a,x+1)
    }
  
    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the number want to check is Prime:");
        val num = input.nextInt();
        println(prime(num));
    }
} 