

//class - final
//fields - private and final
// no setter methods using only getters method 
// Parameterized constructor 

final class StringgImmutable {
	
	private final int employeeId;
	private final String employeeName;

	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public StringgImmutable(int employeeId,String employeeName){
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public static void main(String[] args) {
		StringgImmutable str = new StringgImmutable(1, "sai");
		System.out.println(str.getEmployeeId());
		System.out.println(str.getEmployeeName());
	}
}












