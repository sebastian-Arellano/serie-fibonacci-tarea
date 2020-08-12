/**
	jessy sebastian arellano soriano
*/

import java.util.Scanner;

public class Fibonacci{
  public static void main(String args[]){
	  
 Scanner x = new Scanner (System.in);
 
   int i = 0, a = 0, b = 1, c = 0, A;
   
   System.out.println("ingrese numero de serie  a consultar:");
   A=x.nextInt();
   
   for(i = 0; i < A; i++){
    
     c = a + b;
     a = b;
     b = c;
     
    }
   System.out.print(a + ",");
  }
}
