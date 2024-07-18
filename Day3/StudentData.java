package Day_3;
/*WAP to create a class named as 'Student' with its data attributes as:
- name,age,regdNo,instituteName,course.
Create at least 3 different objects of Student , assign the values for different students, display all the values from the main method with suitable example.*/

public class StudentData {


public static void main(String[] args){

Student st=new Student();
st.show("Teju",21,"TS1234","NareshIT","Java_Full Stack");

Student st1=new Student();
st1.show("Monu",25,"MS1234","Leo Coders","Python Django");

Student st2=new Student();
st2.show("Pankaj",19,"PS1234","ICAI","Charted Accountant");

}
}


class Student{
String name;
int age;
String regdNo;
String instituteName;
String cource;

void show(String name,int age,String regdNo,String instituteName,String course){
	System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Registration Number: " + regdNo);
      System.out.println("Institute Name: " + instituteName);
      System.out.println("Course: " + course);

	System.out.println();



}
}

