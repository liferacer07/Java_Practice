package Day_4;

/*Write a program to enter three numbers and a character.
Find and display sum of the numbers if the given character is ’s’ and product of
the numbers if the given character is 'p'. The program displays a message "Invalid
Character" if the user enters a letter other than 's' or 'p'.*/

class Character{
public static void main(String[] args){
 char name='o';
 //char name1='p';

int x=10,y=6;

if(name=='s'){
System.out.println("Sum="+(x+y));
}else if(name=='p'){
System.out.println("Product= "+x*y);
}
else{
System.out.println("Invalid Character:");
}

}}
