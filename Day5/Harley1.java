package Day_5;

/*Design a class Bike with certain attributes and methods.
Display the details of different Bikes with suitable
message.*/

class Bike1 {
static int noOfWheels = 2;
public int speed = 0;
String color;
String fuel;
void show() {
    System.out.println("Bike color is :" + noOfWheels);

    System.out.println("Bike color is: " +speed);

    System.out.println("Bike color is: " + color);

    System.out.println("Bike color is :" + fuel);
}


}

class Harley1 {


public static void main(String[] args) {
Bike1 b1=new Bike1();


b1.speed=101;
b1.color="red";
b1.fuel="petrol";
b1.show();

       }   
}

