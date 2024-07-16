import java.text.DecimalFormat;


class Invoice{

String partNumber;
String partDesc;
int partQuant;
double partprice;

Invoice(){
partNumber="Nil";
partDesc="Nil";
partQuant=0;
partprice=0;
}

void setPartnum(String pNo){
partNumber=pNo;
}

void setDesc(String pDes){
partDesc=pDes;
}

void setQuant(int partQu){
if(partQu>=0){
partQuant=partQu;
}
else{
partQuant=0;
}
}

void setPrice(double partPrice){
if(partPrice>=0){
partprice=partPrice;
}
else{
partprice=0;
}
}

void getPartnum(){
System.out.printf("\nThe Part Number --- %s",partNumber);
}

void getDesc(){
System.out.printf("\nThe Description --- %s",partDesc);
}

void getQuant(){
System.out.printf("\nThe Quantity --- %d",partQuant);
}

void getPrice(){
System.out.printf("\nThe Price --- %f",partprice);
}

void getInvoice(){
double totalprice=  partQuant*partprice;
System.out.printf("\nThe TOTAL PRICE --- %f",totalprice);
}

}

public class Exercise14{
public static void main(String args[]){

DecimalFormat df=new DecimalFormat("0.##");
Invoice obj=new Invoice();
obj.setPartnum("A101");
obj.setDesc("Tool A");
obj.setQuant(-1);
obj.setPrice(-2);
obj.getPartnum();
obj.getDesc();
obj.getQuant();
obj.getPrice();
obj.getInvoice();

Invoice obj1=new Invoice();
obj1.setPartnum("A102");
obj1.setDesc("Tool B");
obj1.setQuant(20);
obj1.setPrice(33);
obj1.getPartnum();
obj1.getDesc();
obj1.getQuant();
obj1.getPrice();
obj1.getInvoice();
}
}