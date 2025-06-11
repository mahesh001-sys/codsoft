import java.util.Random;
import java.util.Scanner;
class RandomNumbers{
public static void main(String args[]){
Random number=new Random();
Scanner Sc=new Scanner(System.in);
System.out.println("enter the number");
int n=Sc.nextInt();
int randomnumber=number.nextInt(n+1);
System.out.println("the random number is " +randomnumber);
}
}