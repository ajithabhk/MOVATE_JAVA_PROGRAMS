import java.util.*;

class Exercise8{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers - ");
int a=sc.nextInt();
int b=sc.nextInt();

if(a%b==0){
System.out.printf("%d is multiple of %d",a,b);
}
else{
System.out.printf("%d is not multiple of %d",a,b);
}
}
}
