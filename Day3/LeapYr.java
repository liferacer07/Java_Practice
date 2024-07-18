package Day_3;

 /*Design a program that takes a year as input and determines whether it is a leap year or not. Consider the leap year rules (divisible by 4, but not divisible by 100 unless also divisible by 400) and use if-else statements to provide the appropriate output.
*/

public class LeapYr{
public static void main(String[] args){

int year=2400;

if((year%4==0 && year%100!=0)|| year%400==0){
System.out.println(year+" This is Leap Year");}
else {
System.out.println(year+" THis is not leap year");
}

}}
