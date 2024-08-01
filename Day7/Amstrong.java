package Day_7;

/*WAP create=> create method take integer as input and display wheather Amstrong or not*/

class Amstrong{
 
void amstrng(){
int num=1153,newNum=num,sum=0,x;

while(num>0){

x=num%10;
sum=sum+(x*x*x);
num=num/10;
}
if(sum==newNum){
System.out.println("THis is Perfect Amstrong Number..........");
}
else System.out.println("THis is Not Amstrong Number");
}

public static void main(String [] teju){

Amstrong obj=new Amstrong();
obj.amstrng();

}}
