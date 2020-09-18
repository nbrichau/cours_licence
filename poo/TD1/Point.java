public class Point {
	public double x;
	public double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void afficher(){
			System.out.println("Point {x:" + x + ", y:" + y + "}");
	}

	public void deplacement(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}

	public void deplacement(double delta){
		this.x += delta;
		this.y += delta;
	}

	public double distance(Point p){
		return Math.sqrt(Math.pow(p.x-this.x, 2) + Math.pow(p.y-this.y, 2));
	}
}
