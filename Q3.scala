//19000782
//Q3

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q3{

    def sum(a:Int,b:Int=0):Int = a match{
        case 0 => b
        case x if(x>0) => sum((a-1),(b+a))
    }
    def main(args:Array[String]){
        var input = new Scanner(System.in);
        print("Enter the number:");
        val num = input.nextInt();
        print("The sum is ");
        print(sum(num));
    }
} 