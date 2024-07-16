class Car{
	
	int speed;
	double regularPrice;
	String color="";
	Car(){
		speed=0;
		regularPrice=0;
		color="NIL";
	}
	double getSalePrice(){
		return regularPrice;
	}
}

class Truck extends Car{
	int weight;
	double getSalePrice(){
		if(weight>2000){
			regularPrice=regularPrice-0.1*regularPrice;
			return regularPrice;
		}
		else{
			regularPrice=regularPrice-0.2*regularPrice;
			return regularPrice;
		}
	}
}
class Ford extends Car{
	int year;
	int manufacturerDiscount;
	double getSalePrice(){
		regularPrice=super.getSalePrice()-manufacturerDiscount;
		return regularPrice;
	}
}

class Sedan extends Car{
	int length;
	super();
	double getSalePrice(){
		if(length>20){
			regularPrice=regularPrice-0.05*regularPrice;
			return regularPrice;
		}
		else{
			regularPrice=regularPrice-0.1*regularPrice;
			return regularPrice;
		}
	}
}

public class Exercise19{
public static void main(String args[]){
Sedan sed1=new Sedan();

}
}