package UOH.PROCJECT.JAVA;

public class Faculty extends Person implements Role{
      String employeeID;
	public Faculty(String Name, int Age, String employeeID, String PhoneNumber) {
		super(Name, Age, PhoneNumber);
		this.employeeID = employeeID;
	}

	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
        return "Faculty";
	}

	@Override
	public void performRole() {
        System.out.println("Performing Faculty activities.");
		
	}

}
