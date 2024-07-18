package Day_5;

/*Design a class MobilePhone with certain attributes and methods.
Display the details of different mobile phones with suitable
message.*/
public class Mobile {
static String work="Switch On The Mobile";
String storeName="Apple";

public static void main(String[] args){

Mobile mob=new Mobile();
System.out.println("We Enter the "+mob.storeName+" Mobile Store");
System.out.println("Pic One Mobile");
System.out.println(work);
Apple ap=new Apple();


ap.show();

}}

class Redmi{
int price;
int ram,rom;

}
class Apple{
int price=140000,ram=8,rom=256;
void show(){
System.out.println("The mobile price is="+price);
System.out.println("Mobile Ram is"+ram+" GB");
}
}
