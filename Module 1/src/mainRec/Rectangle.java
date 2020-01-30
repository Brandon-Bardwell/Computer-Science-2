package mainRec;

public class Rectangle {


		private double width;
		private double height;
	
		
		public void setHeight(double h) {
			height = h;
		}
	
		public void setWidth(double w) {
			width = w;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double getArea() {
			return width * height;
		}
		
		public double getPerimeter() {
			return width + height;
		}
		
}
