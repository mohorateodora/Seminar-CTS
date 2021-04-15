package ro.ase.acs.flyweight;

public class Location {
	private int x = 0;
	private int y = 0;
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Location() {
		super();
	}


	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
