package Rutuja.QT_automation;

public class rectangle {
	static class Rectangle {

	    private int length;
	    private int breadth;

	    public Rectangle(int side) {
	        length = side;
	        breadth = side;
	    }

	    public Rectangle(int l, int b) {
	        length = l;
	        breadth = b;
	    }

	    public int getArea() {
	        return length * breadth;
	    }




	    public static void main(String[] args) {

	        Rectangle rect = new Rectangle(10, 5);
	        Rectangle sq = new Rectangle(5);

	        System.out.println(rect.getArea());
	        System.out.println(sq.getArea());
	    }
	}


}
