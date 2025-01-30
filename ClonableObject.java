public class ClonableObject implements Cloneable{
	
	private String name;
	private int age;
	
	public ClonableObject(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ClonableObject [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		ClonableObject ClonableObject = new ClonableObject("mohan",25);
		try {
			Object obj = ClonableObject.clone();
			System.out.println(ClonableObject);
			System.out.println(obj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	

}
