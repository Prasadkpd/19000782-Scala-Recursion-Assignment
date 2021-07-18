//19000782
//Q4

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q4{

    def iseven_odd(a:Int):Unit = a match{
        case x if(x%2)>0 => println("This is a Odd number")
        case _ => println("This is a Even Number")
    }
   
    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the number want to check even or Odd:");
        val num = input.nextInt();
        iseven_odd(num);
    }
} 