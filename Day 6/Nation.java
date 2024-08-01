package Day_6;

/* Wap=> Create 1 static and 1 non static method
call both in main method
*/

public class Nation{
public static void pm(){
System.out.println("Narendra Modi is Global Person in India");
}
public void cm(){
System.err.println("Cm in powerfull In their States outside is Bhikhari");
}
public static void main(String[] args){

pm();

Nation obj=new Nation();

obj.cm();
}
}
