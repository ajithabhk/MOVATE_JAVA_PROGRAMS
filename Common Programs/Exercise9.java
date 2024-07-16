import java.util.Scanner;

class Exercise9{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int largest=0;

int arr[]=new int[10];
int counter=0;
while(counter<10){

System.out.printf("\nCounter %d",counter+1);
System.out.println("\nEnter number");
arr[counter]=sc.nextInt();

if(arr[counter]>largest){
largest=arr[counter];
}
counter+=1;
System.out.printf("\nLargest Num so far is %d",largest);

}


}
}