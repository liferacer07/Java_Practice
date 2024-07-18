package Day_2;

import java.util.*;

public class SumAvg{
public static void main(String[] teju){
int s1,s2,s3,s4,s5;

Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Subject Marks");

s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
int sum=s1+s2+s3+s5+s4;
float avg=sum/5;

System.out.println("Sum="+sum);
System.out.println("Average="+avg+"%");
}
}
