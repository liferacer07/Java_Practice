package Day_4;

/*An Electricity Company charges their consumers according to the
units consumed per month
According to the given traffic:
Units Consumed Charges
Up to 100 units Rs. 2 per unit
More than 100 units and up to 200 units Rs. 1.80 per unit
More than 200 units Rs.1.50 per unit
In addition to the above, every consumer has to pay Rs.200 as Service Charge
per month. Write a program to input the amount of units consumed and
calculate the total charges payable (Bill) by the consumer.*/


class ElectricityBill{
public static void main(String[] args){
 double units=190;
double total;
if(units<=100){
units=units*2;

}
else if(units<=200){
units=(100*2) + ((units-100)*1.80);
}
else {
units=(100*2) + (100*1.80) + ((units-200)*1.50);}


int sercharge=200;
total=sercharge+units;
System.out.println("Total charge paybill is:"+total);
}}