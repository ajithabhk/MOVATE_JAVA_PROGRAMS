class Holiday{
private String name;
private int day;
private String Month;

Holiday(String name,int day,String Month){
this.name=name;
this.day=day;
this.Month=Month;
} 
static Boolean IsSameMonth(Holiday obj1,Holiday obj2){
if(obj1.Month==obj2.Month){
return true;
}
else{
return false;
}
}

double avgDate(Holiday obj[]){
int sum=0;
for(int i=0;i<3;i++){
sum=sum+obj[i].day;
}
double avg=sum/3;
return avg;
}
}
public class Exercise1{
public static void main(String args[]){
Holiday obj1= new Holiday("Independence Day",4,"July");
Holiday obj2= new Holiday("Abracadabra Day",10,"August");

System.out.println(obj1.IsSameMonth(obj1,obj2)+"\n\n\n");
Holiday[] obj=new Holiday[3];
obj[0]=new Holiday("Independence Day",10,"August");
obj[1]=new Holiday("Williamson Day",10,"September");
obj[2]=new Holiday("Williamson Day",10,"September");
double average=obj1.avgDate(obj);
System.out.println(average);




}
}