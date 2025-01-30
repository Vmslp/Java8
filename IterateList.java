import java.util.ArrayList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		List<Flower> flower = new ArrayList<>();
		flower.add(new Flower("Rose", "red"));
		flower.add(new Flower("Lilly", "white"));
		flower.add(new Flower("Jasmine", "violet"));
		
		for(Flower flow : flower) {
			System.out.println(flow.getFlowerName());
			System.out.println(flow.getFlowerColour());
		}

	}
}

class Flower {
	private String flowerName;
	private String flowerColour;

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public String getFlowerColour() {
		return flowerColour;
	}

	public void setFlowerColour(String flowerColour) {
		this.flowerColour = flowerColour;
	}

	public Flower(String flowerName, String flowerColour) {
		super();
		this.flowerName = flowerName;
		this.flowerColour = flowerColour;
	}

	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}

}
