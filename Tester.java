package sab;

public class Tester {
		private int x;
		private int y;
		
		public void DistanceCalculator(int x, int y) {
		    this.x = x;
		    this.y = y;
		}

		public double distance() {
		    return(Math.sqrt(x*x + y*y));
		}

		public double distance(DistanceCalculator point) {
		    int xDiff = x - point.x;
		    int yDiff = y - point.y;
		    return(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
		}

		public int getX() {
		    return x;
		}

		public int getY() {
		    return y;
		}

	}
 class DistanceTester {
	public static void main(String[] args) {
		DistanceCalculator p1 = new DistanceCalculator(2, 3);
		System.out.println("The distance of p1 from origin is: " + p1.distance());
		DistanceCalculator p2 = new DistanceCalculator(5, 6);
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
		}
}