package oops2_program;

public class Car {
	String name;
	String color;
	int price;
	Engine_car e1=new Engine_car(60,45,36);
	
	Car()
	{
		
	}
	Car(String name,String color,int price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void displaycar() {
		System.out.println("car name is:"+this.name);
		System.out.println("car color is:"+this.color);
		System.out.println("car price is:"+this.price);
	}
}
