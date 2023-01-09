package  com.mps.think.setup.utils;

public class AppConstants {
	
	public static final String OK = "ok";
	public static final String ERROR = "error";
	public static final String WAITING = "Waiting";
	public static final String SUCCESSFULLY_COMPLETED = "Task is Successfully Completed.";
	public static final String ARCHIVE = "Archive";
	public static final Integer MFA_ACTIVE_STATUS = 1;
	public static final String GEO_LOCATION_URL_PROPERTY = "geo.location.service.url";
	
	public static final String Email_Subject = "User Created";
	public static final String Email_User_Name = "User Name";
	public static final String Email_User_Password = "User Password";
	public static final String Email_Semi="-:";
	
	public enum codeGen {
		None("None"), Renewals("Renewals"), Promotions("Promotions");
		
		private String displayName;

		codeGen(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GenerationFunction {
		NA("NA"), New_Renewal("New Renewal"), Order_Year("Order Year"), Order_Month("Order Month"), Order_Week("Order Week"), Expire_Year("Expire Year"), Expire_Month("Expire Month"), Expire_Week("Expire Week"), Effort_Year("Effort Year"),
		Effort_Month("Effort Month"), Effort_Week("Effort Week"), Effort_Number("Effort Number"), Demographic_Response("Demographic Response"), Region("Region"), Test_Sequence("Test Sequence");
		private String displayName;

		GenerationFunction(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum GenerationMethod {
		Carry_Through("Carry Through"), Fixed_Value("Fixed Value"), Function("Function");
		private String displayName;

		GenerationMethod(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}

	public enum AuxCategory {
		Customer("Customer"), CustomerAddress("Customer Address"), Order("Order");
		private String displayName;

		AuxCategory(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}
	
	public enum VariableType {
		String("String"), Integer("Integer"), Boolean("Boolean");
		private String displayName;

		VariableType(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }

	    @Override public String toString() { return displayName; }
	}
	
}
