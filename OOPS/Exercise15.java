class Employee{
String firstname="";
String lastname="";
double salary;


Employee(){
firstname="Nil";
lastname="Nil";
salary=0;
}

void setFirstname(String a){
firstname=a;
}

void setLastname(String b){
lastname=b;
}

void setSalary(double salary){
if(salary>=0){
this.salary=salary;
}

else{
this.salary=0;
}
}

void getFirstname(){
System.out.printf("\nThe First Name --- %s",firstname);
}

void getLastname(){
System.out.printf("\nThe Last Name --- %s",lastname);
}

void getSalary(){
System.out.printf("\nThe Yearly Salary --- %f",salary*12);
}

void setRaise(){
salary=0.1*salary+salary;
}

}

public class Exercise15{
public static void main(String args[]){

Employee obj1=new Employee();
Employee obj2= new Employee();
obj1.setFirstname("Ajithabh");
obj1.setLastname("Krish");
obj1.setSalary(20000);
obj2.setFirstname("Abhay");
obj2.setLastname("Jake");
obj2.setSalary(30000);

obj1.getFirstname();
obj1.getLastname();
obj1.getSalary();
obj2.getFirstname();
obj2.getLastname();
obj2.getSalary();

obj1.setRaise();
obj2.setRaise();

System.out.println("\n\n--- After Raise ---");
obj1.getFirstname();
obj1.getLastname();
obj1.getSalary();

System.out.println("\n");
obj2.getFirstname();
obj2.getLastname();
obj2.getSalary();
}
}