package Day_4;

/*Write a program to accept a mark obtained by a student in
computer science and print the grades accordingly:
Marks Grade
Above 90 A
70 to 89 B
50 to 69 C
below 50 D*/

class Grades{
public static void main(String [] args){
int marks=39;

if(marks>=90)System.out.println("Student Have grades is A");

if(marks>=70 && marks<90)System.out.println("Student Have grades is B");

if(marks>=50 && marks<70)System.out.println("Student Have grades is C");

if(marks<50)System.out.println("Student Have grades is D");
}}
