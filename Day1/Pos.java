package day_1;

/*Write a java program to check wheather a number is positive negative or zero..
*/

import java.util.*;
class Pos{
public static void main(String[]  args){


Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();

if(num>0){
System.out.println("Positive number="+num);
}
else if(num<0){
System.out.println("Negative number="+num);
}
else{
System.out.println("Zero");
}

}}
