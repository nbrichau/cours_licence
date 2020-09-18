public class TestCercle {
	public static void main(String[] args) {
		Cercle c1 = new Cercle(new Point(1, 2), 2);
		Cercle c2 = new Cercle(new Point(1, 1), 4);
		Cercle c3 = new Cercle(new Point(2, 3), 3);

		System.out.println("La surface du cercle c1 est : " + c1.surface());
		System.out.println(c2.estInterieur(c1.centre) ? "Le cercle c2 est à l'intérieur de c1" : "Le cercle c2 n'est pas à l'intérieur de c1");
		System.out.println("La surface du cercle c3 est : " + c3.surface());
		System.out.println(c2.estInterieur(c3.centre) ? "Le cercle c2 est à l'intérieur de c3" : "Le cercle c2 n'est pas à l'intérieur de c3");

	}
}
