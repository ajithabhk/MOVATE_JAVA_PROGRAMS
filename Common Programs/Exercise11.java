import java.util.Scanner;
import java.util.Arrays; 

class Exercise11{

public static void main(String args[]){

int arr[]=new int[10];
Arrays.fill(arr,0);

int arr1[]=new int[20];
Arrays.fill(arr,0);
for(int i=0;i<15;i++){
arr1[i]+=1;
}

for(int i=0;i<5;i++){
System.out.print(arr1[i]);
}


}
}