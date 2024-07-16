import java.util.*;

class Exercise7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.printf("Enter 3 nos\n");
int a=sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();

int sum=a+b+c;
int prod=a*b*c;
float avg=sum/3;

System.out.printf("Sum - %d \nProduct - %d\n Average - %f",sum,prod,avg);

if(a>b){
if(a>c){
System.out.printf("The greatest num is %d",a);
}
else{System.out.printf("The greatest num is %d",c);}
}

if(a<b){
if(c<b){
System.out.printf("The greatest num is %d",b);
}
else{System.out.printf("The greatest num is %d",c);}
}
else{
System.out.printf("The greatest num is %d",c);
}
}
}
