package Day_7;

/*WAP=> - create method to input the unit price and quantity of product.
- Calculate the total cost, discount 20% if the total purchase is more than 20,000 otherwise discount is 10%.Also find total price to pay.
*/

class Product{
public static void main(String [] args){
double unitPrice=5000;int quantity=3;	double totalCost;
double allPrice=unitPrice*quantity;double discount;


if(allPrice>20000){
discount=allPrice * 0.2;
}


else {
discount=allPrice * 0.1;
}


totalCost=allPrice-discount;
System.out.println("Hehe U got Discount"+discount);
System.out.println("Ur Total Cost including Discount is:"+totalCost);

}}
