import java.util.Scanner;

public class Geometrie {

	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Construction d'un nouveau point");
		Point[] points = new Point[3];
		System.out.println(points.length);
		for (int i = 0; i<3; i++) {
			double x = clavier.nextDouble();
			double y = clavier.nextDouble();
			points[i] = new Point(x, y);
			points[i].afficher();
		}
		System.out.println("Périmètre : " + (points[0].distance(points[1]) + points[1].distance(points[2]) + points[2].distance(points[0])));
		System.out.println("Isocèle : " + (estIsocele(points[0],points[1],points[2]) ? "oui" : "non"));
	}

	private static boolean estIsocele(Point a, Point b, Point c){
		return a.distance(b) == a.distance(c) ||
			b.distance(a) == b.distance(c) ||
			c.distance(a) == c.distance(b);
	}
}
