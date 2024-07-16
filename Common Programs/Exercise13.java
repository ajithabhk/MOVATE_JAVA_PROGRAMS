import java.util.Scanner;



class Account{
int balance;

public void debit(int amount){
if(amount>balance){
System.out.println("\n\nInsufficient Balance\n\n");
}
else{
balance=balance-amount;
System.out.printf("Account Balance -- %d",balance);
}
}
}


public class Exercise13{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Account obj=new Account();
obj.balance=3000;
obj.debit(1000);
}

}