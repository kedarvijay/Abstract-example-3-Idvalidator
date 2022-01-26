

public class EmployeeIDValidator extends IDValidator {

	@Override
	public boolean validate() {
		char first=getId().charAt(0);
		if(first=='e' && getId().length()==5) {	
			return(true);
		}
		else {
			return(false);
				
		}
		

	}

	public static void main(String[] args) {
		EmployeeIDValidator val = new EmployeeIDValidator();
		val.setId("eesai");
		
		System.out.println(val.validate());

	}

}
