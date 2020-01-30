package mainRec;
public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		
		Rectangle rec2 = new Rectangle();
		
		rec.setHeight(40);
		rec.setWidth(4);
		
		rec2.setHeight(35.9);
		rec2.setWidth(3.5);
		
		
		System.out.println("The height of the first rectangle is " + rec.getHeight());
		System.out.println("The Width of the first rectangle is " + rec.getWidth());
		System.out.println("The area of the first rectangle is " + rec.getArea());
		System.out.println("The perimeter of the first rectangle is " + rec.getPerimeter());
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("The height of the second rectangle is " + rec2.getHeight());
		System.out.println("The width of the second rectangle is " + rec2.getWidth());
		System.out.println("The area of the second rectangle is " + rec2.getArea());
		System.out.println("The perimeter of the second rectangle is " + rec2.getPerimeter());
	
	}

}
