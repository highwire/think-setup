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
		None, Renewals, Promotions
	}

	public enum GenerationFunction {
		NA, New_Renewal, Order_Year, Order_Month, Order_Week, Expire_Year, Expire_Month, Expire_Week, Effort_Year,
		Effort_Month, Effort_Week, Effort_Number, Demographic_Response, Region, Test_Sequence
	}

	public enum GenerationMethod {
		Carry_Through, Fixed_Value, Function
	}

	public enum AuxCategory {
		Customer, CustomerAddress, Order
	}
	
	public enum VariableType {
		String, Integer, Boolean
	}
	
}
