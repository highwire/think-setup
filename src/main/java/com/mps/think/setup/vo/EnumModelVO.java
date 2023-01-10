package com.mps.think.setup.vo;

public class EnumModelVO {
	public static enum Currency {

	    USD("USD"),INR("INR"),POUND("POUND"),EURO("EURO");

	    private final String displayCurrency;

	    Currency(String displayCurrency) {
	        this.displayCurrency = displayCurrency;
	    }

	    public String getDisplayName() {
	        return displayCurrency;
	    }
	}

	public static enum DateFormat  {

		MMDDYY("MMDDYY"),DDMMYY("DDMMYY"),YYMMDD("YYMMDD");

	    private final String displayDateFormat;

	    DateFormat(String displayDateFormat) {
	        this.displayDateFormat = displayDateFormat;
	    }

	    public String getDisplayName() {
	        return displayDateFormat;
	    }
	}
	
	public static enum TimeZone  {

		IST("IST"),AEST("AEST"),ACST("ACST"),AWST("AWST"),PDT("PDT"),MST("MST"),
		MDT("MDT"),CST("CST"),CDT("CDT"),EST("EST"),EDT("EDT"),AST("AST"),ADT("ADT"),
		NDT("NDT"),BST("BST"),HST("HST"),HDT("HDT"),AKDT("AKDT");

	    private final String displayTimeZone;

	    TimeZone(String displayTimeZone) {
	        this.displayTimeZone = displayTimeZone;
	    }

	    public String getDisplayName() {
	        return displayTimeZone;
	    }
	}

	
	public static enum SubDefStatus {
		
		ACTIVE("ACTIVE"), INACTIVE("INACTIVE");
		
		private final String status;
		
		private SubDefStatus(String status) {
			this.status = status;
		}
		
		public String getStatus() {
			return status;
		}
		
	}

	public static enum OrderClasses  {

		SAMPLE_1("SAMPLE_1"),SAMPLE_2("SAMPLE_2"),SAMPLE_3("SAMPLE_3");

	    private final String displayOrderClasses;

	    OrderClasses(String displayOrderClasses) {
	        this.displayOrderClasses = displayOrderClasses;
	    }

	    public String getDisplayName() {
	        return displayOrderClasses;
	    }
	}
	
	public static enum StartType  {

		ANY_TIME_START("ANY_TIME_START"),VOLUME_GROUP_START("VOLUME_GROUP_START"),DATA_BASED_WITH_ISSUES("DATA_BASED_WITH_ISSUES")
	    ,DATA_BASED_WITH_NO_ISSUES("DATA_BASED_WITH_NO_ISSUES"),DATA_BASED_WITH_UNITS("DATA_BASED_WITH_NO_ISSUES"),
		DATE_BASED_WITH_UNITS("DATE_BASED_WITH_UNITS"), UNIT_BASED_NO_TIME("UNIT_BASED_NO_TIME"),ANY("ANY");

	    private final String displayStartType;

	    StartType(String displayStartType) {
	        this.displayStartType = displayStartType;
	    }

	    public String getDisplayName() {
	        return displayStartType;
	    }
	}
	
	public static enum InstallmentTerm  {

		MONTHLY("MONTHLY"),YEARLY("YEARLY"),HALF_YEARLY("HALF_YEARLY");

	    private final String displayInstallmentTerm;

	    InstallmentTerm(String displayInstallmentTerm) {
	        this.displayInstallmentTerm = displayInstallmentTerm;
	    }

	    public String getDisplayName() {
	        return displayInstallmentTerm;
	    }
	}
	
	public static enum source_code_type  {

		Zero("Basic"),One("Package "),Two("Dual "),Three("Catalog"),four("Generic"),five("Shipping ");

	    private final String displaysource_code_type;

	    source_code_type(String displaysource_code_type) {
	        this.displaysource_code_type = displaysource_code_type;
	    }

	    public String getDisplayName() {
	        return displaysource_code_type;
	    }
	}
//	======================================================================================
	public static enum AddressType {
		
		 Business("Business"),Residential("Residential");

		    private final String displayAddressType;

		    AddressType(String displayAddressType) {
		        this.displayAddressType = displayAddressType;
		    }

		    public String getDisplayName() {
		        return displayAddressType;
		    }

	}
		public static enum AddressCategory {
			
			ShippingAddress("ShippingAddress") ,BillingAddress("BillingAddress"),RenewalAddress("RenewalAddress"),AlternateAddress("AlternateAddress");

			    private final String displayAddressCategory;

			    AddressCategory(String displayAddressCategory) {
			        this.displayAddressCategory = displayAddressCategory;
			    }

			    public String getDisplayName() {
			        return displayAddressCategory;
			    }

		}
		public static enum Frequency {
			
			 EveryYear("EveryYear"),None("None");

			    private final String displayFrequency;

			    Frequency(String displayFrequency) {
			        this.displayFrequency = displayFrequency;
			    }

			    public String getDisplayName() {
			        return displayFrequency;
			    }

		}
		public static enum CustomerCategory {
			
			Agency("Agency"),Individual("Individual"),Institutional("Institutional");

			    private final String displayCustomerCategory;

			    CustomerCategory(String displayCustomerCategory) {
			        this.displayCustomerCategory = displayCustomerCategory;
			    }

			    public String getDisplayName() {
			        return displayCustomerCategory;
			    }

		}
		
	    public static enum ConfigurationOptionsforOrders {
			
	    	BundleDiscounts("Bundle Discounts"),BillToAgency("Bill to Agency"),RenewToAgency("Renew to Agency");

			    private final String displayConfigurationOptionsforOrders;

			    ConfigurationOptionsforOrders(String displayConfigurationOptionsforOrders) {
			        this.displayConfigurationOptionsforOrders = displayConfigurationOptionsforOrders;
			    }

			    public String getDisplayName() {
			        return displayConfigurationOptionsforOrders;
			    }

		}
	    
	 public static enum PaymentOptions {
			
		 PayCommissionToAgency("Pay Commission to Agency"),AgencyRemitsNetPayment("Agency Remits Net Payment");

			    private final String displayPaymentOptions;

			    PaymentOptions(String displayPaymentOptions) {
			        this.displayPaymentOptions = displayPaymentOptions;
			    }

			    public String getDisplayName() {
			        return displayPaymentOptions;
			    }

		}
	 
	 public static enum ChargeTaxOn {
			
		 AgencyPaysTax("Agency Pays Tax"),TaxChargedOnGross("Tax Charged On Gross"),TaxChargedOnNet("Tax Charged On Net");

			    private final String displayChargeTaxOn;

			    ChargeTaxOn(String displayChargeTaxOn) {
			        this.displayChargeTaxOn = displayChargeTaxOn;
			    }

			    public String getDisplayName() {
			        return displayChargeTaxOn;
			    }

		}
	 
	 public static enum PaymentStatus  {

			Pending("Pending"),Completed("Completed"),Cancelled("Cancelled");

		    private final String displaypaymentStatus;

		    PaymentStatus(String displaypaymentStatus) {
				this.displaypaymentStatus = displaypaymentStatus;
			}

			public String getDisplayName() {
		        return displaypaymentStatus;
		    }
		}
	 
	 public static enum OrderStatus  {

			Active("Active"),Inactive("Inactive"),Pending("Pending");

		    private final String displayOrderStatus;

		    OrderStatus(String displayOrderStatus) {
				this.displayOrderStatus = displayOrderStatus;
			}

			public String getDisplayName() {
		        return displayOrderStatus;
		    }
		}
	 
	 public static enum OrderType  {

			SingleCopyOrder("SingleCopyOrder"),BasicPackageOrder("BasicPackageOrder"),DateBasedSubscriptionOrder("DateBasedOrder"),IssueBasedSubscriptionOrder("IssueBasedSubscriptionOrder");

		    private final String displayOrderType ;

		    OrderType(String displayOrderType ) {
				this.displayOrderType  = displayOrderType ;
			}

			public String getDisplayName() {
		        return displayOrderType ;
		    }
		}

}
