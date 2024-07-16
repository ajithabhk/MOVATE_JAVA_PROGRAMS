class SavingsAccount{
static double annualInterestRate;
private double savingsBalance;

SavingsAccount(double balance){
savingsBalance=balance;
}
void calculateMonthlyInterest(){
System.out.printf("\nMonthly interest --- %f",savingsBalance*(annualInterestRate/12));
savingsBalance=savingsBalance+savingsBalance*(annualInterestRate/12);
}

void modifyInterestRate(int rate){
annualInterestRate=rate;
}

public void getBalance(){
System.out.printf("\nBalance is --- %f",savingsBalance);
}
}

public class Exercise17{
public static void main(String args[]){
SavingsAccount saver1=new SavingsAccount(2000);
SavingsAccount saver2=new SavingsAccount(3000);
saver1.annualInterestRate=0.04;
saver2.annualInterestRate=0.04;
System.out.println("Old Balance");
saver1.getBalance();
saver1.calculateMonthlyInterest();
System.out.println("\n\nNew Balance");
saver1.getBalance();
System.out.println("\nOld Balance");
saver2.getBalance();
saver2.calculateMonthlyInterest();
System.out.println("\n\nNew Balance");
saver2.getBalance();
//annualInterestRate=0.04;

System.out.println("\nNOW LET INTEREST RATE BE 5%\n");
saver1.annualInterestRate=0.05;
saver2.annualInterestRate=0.05;
System.out.println("Old Balance");
saver1.getBalance();
saver1.calculateMonthlyInterest();
System.out.println("\n\nNew Balance");
saver1.getBalance();
System.out.println("\nOld Balance");
saver2.getBalance();
saver2.calculateMonthlyInterest();
System.out.println("\n\nNew Balance");
saver2.getBalance();

saver2.getBalance();

}
}