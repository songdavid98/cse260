package cse260lab2;

public class MyPoint {
	
	public double x;
	public double y;

	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint mp) {
		return Math.sqrt( Math.pow(this.x-mp.getX(), 2) + Math.pow(this.y-mp.getY(), 2));
	}
	
	public double distance(int x, int y) {
		return Math.sqrt( Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
	}

}
