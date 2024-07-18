package Day_5;

/*Write a program for the following requirement:
StudyTable is an object of the class Furniture.
Provide the operations and data members of your choice.
Print the details with suitable message.*/

public class Furniture{
String think="Useful for Student";
String lamp="Is blow the light";
int pen=4;
public static void main(String[] args){

Furniture studyTable=new Furniture();

System.out.println("Study table is "+studyTable.think);
System.out.println("Lamp "+studyTable.lamp);
System.out.println("I have "+studyTable.pen);

}}
