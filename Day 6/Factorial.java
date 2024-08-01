package Day_6;

/*4. Find factorial of Number number by using for loop.
input
:5
output
:120.*/

public class Factorial{
public static void main(String[] args){
	 Show sh=new Show();
sh.display();
System.out.println(sh.result);
}}
class Show{
int n=5,result=1;
void display(){
for(int i=2;i<=n;i++){
result=result*i;
}}
}

