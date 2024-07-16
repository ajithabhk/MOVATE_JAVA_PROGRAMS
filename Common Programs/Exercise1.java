import java.util.Scanner;

class Exercise1{
public static void main(String args[]){
System.out.println("Enter Your Name");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
System.out.printf("\n\nYour Name is: ");
System.out.printf("%s",name);
}
}