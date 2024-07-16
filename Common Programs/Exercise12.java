import java.util.Scanner;
import java.text.DecimalFormat;


class Exercise12{

static double Average(int arr[],int count){

int sum=0;
for(int i=0;i<count;i++){
sum=sum+arr[i];
}
double avg = (double) sum / count;
return avg;

}



/* static double DecimalFormat(double avg){

double shiftedNumber = avg * 100;
long roundedNumber = Math.round(shiftedNumber);
double roundedAvg = roundedNumber / 100.0;
return roundedAvg;

} */

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
//buy grades from user
int grad[]=new int[20];
System.out.println("Enter your grades and enter '-1' if ends \n");
int counter=0;
int flag=0;

while(counter<20 && flag==0){
int a=sc.nextInt();

if(a>=0){
grad[counter++]=a;
}

else {
flag=1;
break;
}
System.out.println("check");
}

double avg=Average(grad,counter);
System.out.printf("\n\n\nThe average is (before Formation)--- %f",avg);
DecimalFormat df = new DecimalFormat("0.##");
System.out.println("\n\n\nThe average is --- " +df.format(avg));

}
}