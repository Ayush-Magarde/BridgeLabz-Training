class CollinearPoints {

	// Method using slope
	public static boolean isCollinearUsingSlope (int x1, int y1, int x2, int y2, int x3, int y3) {
		return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
	}

	// Method using area
	public static boolean isCollinearUsingArea (int x1, int y1, int x2, int y2, int x3, int y3) {
		int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
		return area == 0;
	}

	public static void main (String[] args) {
		int x1 = 2, y1 = 4;
		int x2 = 4, y2 = 6;
		int x3 = 6, y3 = 8;

		System.out.println("Slope Method: " + isCollinearUsingSlope(x1,y1,x2,y2,x3,y3));
		System.out.println("Area Method: " + isCollinearUsingArea(x1,y1,x2,y2,x3,y3));
	}
}
