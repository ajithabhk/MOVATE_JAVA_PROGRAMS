import java.util.Scanner;

class Exercise10{

static double volumeSphere(double r) {
double pi=3.14;
double vol=((4/3)*pi*r*r*r);
return vol;

}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("\nEnter Radius of sphere -- ");
double rad=sc.nextDouble();
double volume=volumeSphere(rad);
System.out.printf("\nThe Volume of Sphere is -- %f",volume);
}
}