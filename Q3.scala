//19000782
//Q3
//Can you write a recursive function returns the addition of numbers from1 to n?

import scala.io.StdIn.readInt;

object Q3{

    def sum(a:Int,b:Int=0):Int = a match{
        case 0 => b
        case x if(x>0) => sum((a-1),(b+a))
    }
    def main(args:Array[String]){
        print("Enter the number:");
        val num = scala.io.StdIn.readInt();
        print("The sum is ");
        print(sum(num));
    }
} 