public class Cercle {
	public double rayon;
	public Point centre;
	private String couleur;// rrggbb

	public Cercle(Point centre, double rayon, String couleur){
		this.rayon = rayon;
		this.centre = centre;
		this.couleur = couleur;
	}

	public double surface(){
		return Math.PI * Math.pow(this.rayon, 2);
	}

	public boolean estInterieur(Point p){
		return p.distance(this.centre) <= this.rayon;
	}

	public void setCouleur(String couleur){
		this.couleur = couleur;
	}

	public String getCouleur(){
		return this.couleur;
	}

	public String svg(){
		return "<?xml version='1.0' encoding='utf-8'?>\n" +
			"<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='100' height='100' fill='#" + this.couleur + "'>\n" +
			"\t<circle cx='" + this.centre.x + "' cy='" + this.centre.y + "' r='" + this.rayon + "' />\n" +
			"</svg>";
	}

}
