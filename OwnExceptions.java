public class OwnExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OwnExceptions(String message) {
		super(message);
	}

}

class CustomExceptions2 {

	public static void main(String[] args) {

		int votingAge = 18;
		try {
			if (votingAge < 18) {
				throw new OwnExceptions("not able to vote.....");
			} else {
				throw new OwnExceptions("u can vote.....");
			}
		} 
		catch (OwnExceptions ex) {
			System.out.println(ex.getMessage());
		}
	}
}
