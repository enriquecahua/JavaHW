
package trystuff;

import java.io.*;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.ArrayList;
public class Java2Lab1 {

    
public int [] getArray(int digit)
{
int[] ar = new int[3];
for(int i = 2; i > 0; i--)
{
ar[i] = digit % 10;
digit /= 10; 
}
ar[0] = digit;
return ar;

}

public int sumNumbers(int digit)
{
int ar[] = this.getArray(digit);
int sum = 0;
for(int i = 0; i < 3; i++)
sum += ar[i];

return sum;
}


public String reverseNums(int digit)
{
int ar[] = this.getArray(digit);
String str = "";
for(int i = 2; i >= 0; i--)
str+= ar[i];

return str;
}



public static void main(String[] args)
{
Java2Lab1 lab1 = new Java2Lab1();
System.out.println("Enter a 3-digit number");
Scanner in = new Scanner(System.in);
int num = in.nextInt();

System.out.println("The sum of the numbers is " + lab1.sumNumbers(num));
System.out.println("In Reverse the numbers are " + lab1.reverseNums(num));
System.out.println("Printing Array");

int [] ar = lab1.getArray(num);

for(int i = 0; i < 3; i++)
{
System.out.println(ar[i]);
}

}

}
