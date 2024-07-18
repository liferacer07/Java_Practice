package Day_3;

/*1). Write a java program that takes an hour in the 24-hour format as input and identifies the time of day as "Morning," "Afternoon," "Evening," or "Night." Implement this using a series of if statements. Ensure that the program also checks for invalid input, displaying an appropriate message if the entered hour is not within the valid range (0-23). Present the program with a suitable title and header for clarity.
*/



public class Clock{
public static void main(String[] teju)
{

double time=22.0;

if(time>=6.00 && time<=11.59){
System.out.println("Morning");}

else if(time>=12.00 && time<=15.59){
System.out.println("Afternoon");}

else if(time>=16.00 && time<=19.59){
System.out.println("Evening");}
else if((time>=20.00 && time<24.00)||(time>=0.0 && time<=5.59) ){
System.out.println("Night");}

else
{
System.out.println("Invalid Time");
}

}}
