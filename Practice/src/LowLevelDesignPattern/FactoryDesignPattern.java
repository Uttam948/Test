package LowLevelDesignPattern;


interface Shape{
	
	public void draw();
}
class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("This Cricle");
	}
	
}
class Square implements Shape{
	
	@Override
	public void draw() {
		System.out.println("This Square");
	}
	
}
class Rectangle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("This Ractangle");
	}
	
}

class DecideTheShape{
	
	Shape getShape(String shape) {

		switch(shape)
		{
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		       
     
		}      
		       return null;
	}
}

public class FactoryDesignPattern {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecideTheShape decideTheShape = new DecideTheShape();
		decideTheShape.getShape("Square").draw();

	}

}
