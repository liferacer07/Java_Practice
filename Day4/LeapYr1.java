package Day_4;

/*Write a program to input year and check whether it is:
(a) a Leap year (b) a Century Leap year (c) a Century year but not a Leap year
Century years are NOT leap years UNLESS they can be evenly divided by 400.
(For example, 1700, 1800, and 1900 were not leap years, but 1600 and 2000,
which are divisible by 400, were.)
Sample Input: 2000
Sample Output: It is a Century Leap Year.*/

class LeapYr1 {
public static void main(String[] args){
int leapyr=1916;


if(leapyr%400==0 && leapyr%4==0){
System.out.println("it is a century leap year ");}

else if(leapyr%4==0 && leapyr%100!=0)
{System.out.println("Its a Leap Year");
}
else if(leapyr%400!=0 && leapyr%100==0){
System.out.println("Its century year but not leap year");}
else{
System.out.println("please enter valid year");
}
}}