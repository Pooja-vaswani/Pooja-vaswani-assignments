abstract class Shape{
	abstract public void draw();
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle has been drawn");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line has been drawn");
	}
}
class Cube extends Shape{
	public void draw() {
		System.out.println("Cube has been drawn");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Square has been drawn");
	}
}
public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Shape rectangle=new Rectangle();
		rectangle.draw();
		Shape line=new Line();
		line.draw();
		Shape cube=new Cube();
		cube.draw();
		Shape square=new Square();
		square.draw();
	}

}