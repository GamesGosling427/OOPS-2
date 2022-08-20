package oops2_program;

public class Engine_car {
	int hp;
	int cylinder;
	int strokes;
	Engine_car()
	{
	}

	Engine_car(int hp,int cylinder, int strokes)
	{
	this.hp=hp;
	this.cylinder=cylinder;
	this.strokes=strokes;
	}
	public void displayEngine() {
	System.out.println("hp is:"+this.hp);
	System.out.println("cylinder is:"+this.cylinder);
	System.out.println("strokes is:"+this.strokes);

	}
}
