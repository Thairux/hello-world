import java.util.Scanner;

public class odd 
{

public static void main(String args[]) 
{

 int num1 , num2 ,oddsum=0 ;
 
 Scanner num= new Scanner(System.in);
 System.out.println(" enter min value ");
 num1 = num.nextInt();
 System.out.println("enter max value ");
 num2 = num.nextInt();
 
 while(num1 < num2) 
{ 
 if(num1%2==0)
   num1++;
  oddsum+=num1;
 System.out.println(","+num1++);  
}
 
  System.out.println("sum of the odd numbers="+oddsum);
 
}; 
}
