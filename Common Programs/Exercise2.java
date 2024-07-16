import java.util.Scanner;

class Exercise2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Three Numbers: ");


int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int d=a*b*c;

System.out.printf("\n The Product of three no.s ---: %d",d);
}
}