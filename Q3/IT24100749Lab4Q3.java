import java.util.Scanner;

public class IT24100749Lab4Q3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");
int number=input.nextInt();

input.close();

String result = (number>0)? "The number is Positive."
               : (number<0)? "The number is Negative."
               : "The number is Zero,";
System.out.println(result);
}
}