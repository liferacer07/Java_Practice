package Day_6;

/*Write a Java program to find sum of n natural number by using for loop?
input : n = 10.
output
:sum is 55.*/

class SumNatNumber{
public static void main(String[] main){
int num=20,sum=0;

for(int i=1;i<=num;i++){
sum=sum+i;
}
System.out.println("THe total number of 1 to "+num+" = "+sum);
}}