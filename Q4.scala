//19000782
//Q4

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q4{

    def isEven(m:Int): Boolean=m match{
        case 0 => true
		case _ => isOdd(m-1)
   	}
	
	def isOdd(m:Int): Boolean={
     	!(isEven(m)) 
   	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		println("Determine given number is odd or even");
		print("Enter the number :");
		val num=input.nextInt();

		if(isOdd(num))
			println("Odd");
		else
			println("Even");
	}
} 