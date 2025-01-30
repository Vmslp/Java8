

//create a varaiable and initialize to null
//single instance create
//create private Default constructor
//using factory method - getInstance()

public class Singleton {

	private static Singleton singletonObj;

	private Singleton() {}

	public static Singleton getInstance() {
		if (singletonObj == null) {
			singletonObj = new Singleton();
		}
		return singletonObj;
	}
	public static void main(String[] args) {
		
		Singleton singletonObject = Singleton.getInstance();
		System.out.println(singletonObject);
	}
}
















