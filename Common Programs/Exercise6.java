import java.util.*;

class Exercise6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.printf("Enter 2 nos\n");
int a=sc.nextInt();
int b= sc.nextInt();

if(a>b){
System.out.printf("%d is greater than %d",a,b);
}

else if(b>a){
System.out.printf("%d is greater than %d",b,a);
}

else{
System.out.printf("%d is equal to %d",b,a);
}
}

}
