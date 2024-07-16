class Date{
int year;
int month;
int day;
Date(){
year=1;
month=1;
day=1;
}

void setDay(int day){
if(day<=31){
this.day=day;
}
else{
this.day=0;
}
}

void setYear(int year){
this.year=year;
}

void setMonth(int month){
if(month<=12){
this.month=month;}
else{
this.month=0;
}
}

void getDay(){
System.out.printf("Day - %d",day);
}

void getMonth(){
System.out.printf("\tMonth - %d",month);
}

void getYear(){
System.out.printf("\tYear - %d",year);
}

void displayDate(){
System.out.printf("\n\nDATE IS \n%d / %d / %d",day,month,year);
}

}



public class Exercise16{
public static void main(String args[]){
Date obj=new Date();
obj.setDay(02);
obj.setMonth(12);
obj.setYear(2012);

obj.getDay();
obj.getMonth();
obj.getYear();
obj.displayDate();
}
}