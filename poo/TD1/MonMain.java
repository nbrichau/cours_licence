import java.io.FileWriter;
import java.io.IOException;

public class MonMain {
	public static void main(String[] args) throws IOException {
		Cercle cercle = new Cercle(new Point(20, 20), 10, "ff00ff");

		FileWriter out = new FileWriter("test.svg");
		out.write(cercle.svg());
		out.close();
	}
}
